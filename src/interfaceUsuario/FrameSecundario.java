package interfaceUsuario;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public abstract class FrameSecundario extends FramePrincipal {
	protected String textoPrincipal;
	protected int widthTexto;
	protected int heightTexto;

	public FrameSecundario() {

		height = 900;
		width = 750;
		widthTexto = 3 * width / 4;
		heightTexto = height / 8;
		definirTexto();
		
		JTextArea txtArea = new JTextArea(textoPrincipal);
		txtArea.setEditable(false);
		txtArea.setFont(new Font("Arial", 0, 14));
		getContentPane().add(caixaDeTexto(txtArea, width / 8, height / 6, widthTexto, heightTexto));
	}

	/***************************************************************************/

	protected JScrollPane caixaDeTexto(JTextArea txtArea, int posX, int posY, int w,int h) {

		JScrollPane scrollPane = new JScrollPane(txtArea);
		Dimension d = txtArea.getPreferredSize();
		
		scrollPane.setBounds(posX, posY, w, h);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		return scrollPane;

	}

	/***************************************************************************/

	protected void inserirImagem(String imagem, int posX, int posY) {
		ImageIcon icon = getImagem(imagem);
		JLabel label = new JLabel(icon);
		label.setBounds(posX, posY, icon.getIconWidth(), icon.getIconHeight());
		getContentPane().add(label);

	}

	/*******************************************************************************/

	private ImageIcon getImagem(String nome) {
		String caminhoDaImagem = "imagens/" + nome;
		ClassLoader classLoader = this.getClass().getClassLoader();
		ImageIcon icone = new ImageIcon(classLoader.getResource(caminhoDaImagem));
		return icone;
	}

	protected abstract void definirTexto();
}
