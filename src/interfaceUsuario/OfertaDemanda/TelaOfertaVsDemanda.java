package interfaceUsuario.OfertaDemanda;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;
import interfaceUsuario.OfertaDemanda.OfertaDemandaExemplo;

public class TelaOfertaVsDemanda extends FrameSecundario {
	private javax.swing.JComboBox<String> cBoxOferta;
	private javax.swing.JComboBox<String> cBoxDemanda;

	public TelaOfertaVsDemanda() {
		inserirImagem("ofertaVsDemandaMATLAB.jpg", width / 5, height / 3);
		initComponents();
		iniciarExtra();
		setTitulo("Curva de Oferta e Demanda");
	}

	/***************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaMicroeconomia = InterfaceController.controlaTelas("TelaMicroeconomia");
		telaMicroeconomia.setVisible(true);

		dispose();
	}

	/*******************************************************************************/

	public void definirTexto() {
		this.textoPrincipal = "    Em um mercado de concorrência perfeita, oferta e demanda são as duas forças\n"
				+ "que garantem seu funcionamento, determinando precos e a quantidade de produtos\n" + "oferecidos.\n\n"

				+ "    O termo oferta se refere a quantidade disponivel de um produto, ou seja,\n"
				+ "aquela que as empresas querem ou podem vender. Já a demanda é a quantidade\n"
				+ "que os consumidores querem ou podem adquirir desse produto, ou seja, sua procura.\n\n"

				+ "    No gráfico abaixo, temos o preço de um produto em função da quantidade,\n"
				+ "ofertada ou demandada, dele. A função vermelha mostra a relação entre preço\n"
				+ "e quantidade ofertada - curva de oferta. A função azul mostra a relação entre\n"
				+ "preço e quantidade demandada - curva de demanda.\n\n"

				+ "    O ponto de equilíbrio é o ponto de cruzamento das duas funções e aponta o preço\n"
				+ "de equilíbrio do produto. Preço de equilíbrio é preço que iguala oferta e demanda,\n"
				+ "ou seja, a quantidade demandada de um bem se iguala a quantidade ofertada desse\n"
				+ "mesmo bem, estando o preço em equilíbrio podemos dizer que os compradores\n"
				+ "compraram o que desejavam comprar e os vendedores venderam o quanto queriam.\n\n"

				+ "    Selecione uma das opções abaixo para aprender sobre o comportamento das curvas.\n\n";
	}

	/*******************************************************************************/

	public void iniciarExtra() {
		cBoxOferta = new javax.swing.JComboBox<>();
		cBoxOferta.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Manter Oferta", "Aumentar Oferta", "Reduzir Oferta" }));
		Dimension O = cBoxOferta.getPreferredSize();
		cBoxOferta.setBounds(width / 8 + 50, height / 3 + 404, O.width, O.height);
		getContentPane().add(cBoxOferta);

		cBoxDemanda = new javax.swing.JComboBox<>();
		cBoxDemanda.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Manter Demanda", "Aumentar Demanda", "Reduzir Demanda" }));
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

	/*******************************************************************************/

	public void plottar(ActionEvent e) {
		String respostaO = (String) cBoxOferta.getSelectedItem();
		String respostaD = (String) cBoxDemanda.getSelectedItem();
		// System.out.println("oferta: " +respostaO);
		// System.out.println("demanda: " +respostaD);

		JFrame ofertaDemanda = new OfertaDemandaExemplo(respostaO, respostaD);
		ofertaDemanda.setVisible(true);
		dispose();
	}
	/*******************************************************************************/

}
