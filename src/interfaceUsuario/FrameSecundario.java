package interfaceUsuario;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public abstract class FrameSecundario extends FramePrincipal {
	protected JTextArea txtAreaExplicacao;
	protected String texto;
	public FrameSecundario() {

		height = 1200;
		width = 1000;
		definirTexto();
		inicializaCaixaDeTexto();
	}

	/***************************************************************************/

	protected void inicializaCaixaDeTexto() {

		txtAreaExplicacao = new JTextArea(texto);
		txtAreaExplicacao.setEditable(false);
		txtAreaExplicacao.setFont(new Font("Arial", 0, 14));
		JScrollPane scrollPane = new JScrollPane(txtAreaExplicacao);
		Dimension d = txtAreaExplicacao.getPreferredSize();

		scrollPane.setBounds(width / 4, height / 6, width / 2, height / 8);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scrollPane);

	}
	
	protected abstract void definirTexto();
}
