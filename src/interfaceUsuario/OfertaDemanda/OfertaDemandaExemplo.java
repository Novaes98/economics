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
		if (victoferta.equals("Manter Oferta") && victormanda.equals("Manter Demanda")) {
			inserirImagem("ofertaVsDemandaMATLAB.jpg", width / 5, height / 3);
			this.explicacao = "    O ponto de equilíbrio continua o mesmo se nem uma variável mudar.";

		} else if (victoferta.equals("Manter Oferta") && victormanda.equals("Aumentar Demanda")) {
			inserirImagem("aumentaDemandaOfertaEstavelMATLAB.jpg", width / 5, height / 3);
			this.explicacao = "    Se a oferta de um produto se mantiver constante e houver um aumento da demanda,\n"
					+ "o ponto de equilíbrio se desloca e o preço de equilíbrio sobe.";

		} else if (victoferta.equals("Manter Oferta") && victormanda.equals("Reduzir Demanda")) {
			inserirImagem("diminuiDemandaOfertaEstavelMATLAB.jpg", width / 5, height / 3);
			this.explicacao = "    Se a oferta de um produto se mantiver constante e houver uma redução da demanda,\n"
					+ "o ponto de equilíbrio se desloca e o preço de equilíbrio cai.";

		} else if (victoferta.equals("Aumentar Oferta") && victormanda.equals("Manter Demanda")) {
			inserirImagem("demandaEstavelOfertaAumentaMATLAB.jpg", width / 5, height / 3);
			this.explicacao = "    Se a oferta de um produto aumentar e a demanda por ele se mantiver constante,\n"
					+ "o ponto de equilíbrio se desloca e o preço de equilíbrio cai.";

		} else if (victoferta.equals("Aumentar Oferta") && victormanda.equals("Aumentar Demanda")) {
			inserirImagem("AsDuasAumentamMATLAB.jpg", width / 5, height / 3);
			this.explicacao = "    Se a oferta de um produto aumentar e a demanda por ele também,\n"
					+ "na mesma proporção, ocorre o deslocamento do ponto de equilíbrio e o preço\n"
					+ "de equilíbrio se mantém, mas a quantidade necessária para atingir o preço\n"
					+ "de equilíbrio aumenta.";
			
		} else if (victoferta.equals("Aumentar Oferta") && victormanda.equals("Reduzir Demanda")) {
			inserirImagem("diminuiDemandaAumentaOferta.jpg", width / 5, height / 3);
			this.explicacao = "    Se a oferta de um produto aumentar e a demanda por ele diminuir na mesma proporção,\n"
					+ "o ponto de equilíbrio se desloca e o preço de equilíbrio cai bastante.";

		} else if (victoferta.equals("Reduzir Oferta") && victormanda.equals("Manter Demanda")) {
			inserirImagem("demandaEstavelOfertaDiminuiMATLAB.jpg", width / 5, height / 3);
			this.explicacao = "    Se a oferta de um produto diminuir e a demanda por ele se mantiver constante,\n"
					+ "o ponto de equilíbrio se desloca e o preço de equilíbrio sobe.";

		} else if (victoferta.equals("Reduzir Oferta") && victormanda.equals("Aumentar Demanda")) {
			inserirImagem("aumentaDemandaDimnuiOferta.jpg", width / 5, height / 3);
			this.explicacao = "    Se a oferta de um produto diminuir e a demanda por ele aumentar,\n"
					+ "o ponto de equilíbrio se desloca e o preço de equilíbrio sobe bastante.";

		} else if (victoferta.equals("Reduzir Oferta") && victormanda.equals("Reduzir Demanda")) {
			inserirImagem("AsDuasDiminuemMATLAB.jpg", width / 5, height / 3);
			this.explicacao = "    Se a oferta de um produto diminuir e a demanda por ele diminuir,\n"
					+ "na mesma proporção, ocorre o deslocamento do ponto de equilíbrio, mas o\n"
					+ "preço de equilíbrio se mantém, mas a quantidade necessária para atingir o\n"
					+ "preço de equilíbrio aumenta.";
		}

		cBoxOferta = new javax.swing.JComboBox<>();
		cBoxOferta.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Manter Oferta","Aumentar Oferta","Reduzir Oferta" }));
		cBoxOferta.setSelectedItem(victoferta);

		Dimension O = cBoxOferta.getPreferredSize();
		cBoxOferta.setBounds(width / 8 + 50, height / 3 + 404, O.width, O.height);
		getContentPane().add(cBoxOferta);

		cBoxDemanda = new javax.swing.JComboBox<>();
		cBoxDemanda.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Manter Demanda","Aumentar Demanda", "Reduzir Demanda" }));
		cBoxDemanda.setSelectedItem(victormanda);
		
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
