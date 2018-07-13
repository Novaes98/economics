package interfaceUsuario.OfertaDemanda;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import interfaceUsuario.FramePrincipal;
import interfaceUsuario.InterfaceController;

public class OfertaDemandaExemplo extends FramePrincipal {
	private String victoferta, victormanda, explicacao;
	protected int widthTexto;
	protected int heightTexto;
	private javax.swing.JComboBox<String> cBoxOferta;
	private javax.swing.JComboBox<String> cBoxDemanda;

	public OfertaDemandaExemplo(String o, String d) {
		height = 900;
		width = 750;

		this.victoferta = o;
		this.victormanda = d;
		iniciarExtra();

		width = 750;
		widthTexto = 3 * width / 4;
		heightTexto = height / 8;

		JTextArea txtArea = new JTextArea(explicacao);
		txtArea.setEditable(false);
		txtArea.setFont(new Font("Arial", 0, 14));
		getContentPane().add(caixaDeTexto(txtArea, width / 8, height / 6, widthTexto, heightTexto));
		initComponents();
		setTitulo("Resultado da previsão com os dados escolhidos");
	}

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaOfertaVsDemanda = InterfaceController.controlaTelas("TelaOfertaVsDemanda");
		telaOfertaVsDemanda.setVisible(true);

		dispose();
	}

	private void iniciarExtra() {
		if (victoferta.equals("Invariabilidade da Oferta") && victormanda.equals("Invariabilidade da Demanda")) {
			inserirImagem("OfertaDemanda00.jpg", width / 8 - 50, height / 3);
			this.explicacao = "Com as 2 variáveis invariando temos a constância do ponto de equilíbrio";

		} else if (victoferta.equals("Invariabilidade da Oferta") && victormanda.equals("Aumento da Demanda")) {
			inserirImagem("OfertaDemanda01.jpg", width / 8 - 50, height / 3);
			this.explicacao = "Com a invariância da oferta e o aumento da demanda temos um leve aumento no\r\n"
					+ " preço dos produtos devida à uma acentuada procura";

		} else if (victoferta.equals("Invariabilidade da Oferta") && victormanda.equals("Redução da Demanda")) {
			inserirImagem("OfertaDemanda02.jpg", width / 8 - 50, height / 3);
			this.explicacao = "Com a invariância da oferta e a redução da demanda temos um leve diminuição no \r\n"
					+ "preço dos produtos devida à uma redução na procura";

		} else if (victoferta.equals("Aumento da Oferta") && victormanda.equals("Invariabilidade da Demanda")) {
			inserirImagem("OfertaDemanda10.jpg", width / 8 - 50, height / 3);
			this.explicacao = "Com o aumento da oferta e a invariância da demanda temos um decréscimo do preço \r\n"
					+ "do produto devido a alto número de produtos oferecidos";

		} else if (victoferta.equals("Aumento da Oferta") && victormanda.equals("Aumento da Demanda")) {
			inserirImagem("OfertaDemanda11.jpg", width / 8 - 50, height / 3);
			this.explicacao = "Com o aumento da oferta e da demanda igualitários temos um novo ponto de  \r\n"
					+ "equilíbrio econômico entre oferta e demanda e assim aumentando um pouco o preço";

		} else if (victoferta.equals("Aumento da Oferta") && victormanda.equals("Redução da Demanda")) {
			inserirImagem("OfertaDemanda12.jpg", width / 8 - 50, height / 3);
			this.explicacao = "Com o aumento da oferta e a redução da demanda temos uma queda brusca no preço\r\n"
					+ "pois não há nínguem comprando e excesso de produtos no mercado";

		} else if (victoferta.equals("Redução da Oferta") && victormanda.equals("Invariabilidade da Demanda")) {
			inserirImagem("OfertaDemanda20.jpg", width / 8 - 50, height / 3);
			this.explicacao = "Com a redução da oferta e a invariância da demanda temos uma leve alta no \r\n"
					+ "preço devida uma pequena escassez nos mercado";

		} else if (victoferta.equals("Redução da Oferta") && victormanda.equals("Aumento da Demanda")) {
			inserirImagem("OfertaDemanda21.jpg", width / 8 - 50, height / 3);
			this.explicacao = "Com a redução da oferta e o aumento da demanda temos uma disparada no preço\r\n"
					+ "devido a procura elevada e a escassez do produto no mercado";

		} else if (victoferta.equals("Redução da Oferta") && victormanda.equals("Redução da Demanda")) {
			inserirImagem("OfertaDemanda22.jpg", width / 8 - 50, height / 3);
			this.explicacao = "Com a redução da oferta e demanda temos um novo ponto de equilíbrio entre\r\n"
					+ "oferta e demanda assim reduzindo um pouco o preço";

		}

		cBoxOferta = new javax.swing.JComboBox<>();
		cBoxOferta.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Invariabilidade da Oferta", "Aumento da Oferta", "Redução da Oferta" }));
		Dimension O = cBoxOferta.getPreferredSize();
		cBoxOferta.setBounds(width / 8 + 50, height / 3 + 404, O.width, O.height);
		getContentPane().add(cBoxOferta);

		cBoxDemanda = new javax.swing.JComboBox<>();
		cBoxDemanda.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Invariabilidade da Demanda", "Aumento da Demanda", "Redução da Demanda" }));
		Dimension D = cBoxDemanda.getPreferredSize();
		cBoxDemanda.setBounds(width / 8 + 350, height / 3 + 404, D.width, D.height);
		getContentPane().add(cBoxDemanda);

		JButton btnPlottar = new JButton("Plottar");
		Dimension d = btnPlottar.getPreferredSize();
		btnPlottar.setBounds(width / 2 - 50, height / 3 + 454, d.width, d.height);
		getContentPane().add(btnPlottar);
		btnPlottar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				plottar(e);
			}
		});

	}

	public void plottar(ActionEvent e) {
		String respostaO = (String) cBoxOferta.getSelectedItem();
		String respostaD = (String) cBoxDemanda.getSelectedItem();

		JFrame ofertaDemanda = new OfertaDemandaExemplo(respostaO, respostaD);
		ofertaDemanda.setVisible(true);
		dispose();
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

	/*******************************************************************************/

	protected JScrollPane caixaDeTexto(JTextArea txtArea, int posX, int posY, int w, int h) {

		JScrollPane scrollPane = new JScrollPane(txtArea);

		scrollPane.setBounds(posX, posY, w, h);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		return scrollPane;

	}
	/*******************************************************************************/

}
