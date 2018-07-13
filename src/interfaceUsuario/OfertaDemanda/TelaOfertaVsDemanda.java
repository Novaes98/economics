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
		inserirImagem("OfertaDemanda.jpg", width / 8 - 50, height / 3);
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
		this.textoPrincipal = "Em um mercado de concorrencia perfeita, oferta e demanda sao as duas forcas que \r\n" + 
				"garantem o funcionamento de um mercado, determinando precos e a quantidade de \r\n" + 
				"produtos oferecidos. O termo oferta se refere a quantidade disponivel de um \r\n" + 
				"produto, ou seja, aquela que as empresas querem ou podem vender.\r\n" + 
				"Ja  demanda  a quantidade que os consumidores querem ou podem adquirir desse\r\n" + 
				" produto, ou seja, sua procura.\r\n"
				+ "\nTendo em base que tanto a oferta quanto a demanda estavam em equilibrio \r\n" + 
				"economico e de oferta/demanda podemos gerar possiveis previsoes com bases nas \r\n" + 
				"informacoees atuais do mercado no exemplo abaixo:";
	}

	public void iniciarExtra() {
		cBoxOferta = new javax.swing.JComboBox<>();
		cBoxOferta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Invariabilidade da Oferta","Aumento da Oferta","Reducao da Oferta"}));
		Dimension O = cBoxOferta.getPreferredSize();
		cBoxOferta.setBounds(width / 8 + 50, height / 3 + 404, O.width, O.height);
		getContentPane().add(cBoxOferta);

		cBoxDemanda = new javax.swing.JComboBox<>();
		cBoxDemanda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Invariabilidade da Demanda","Aumento da Demanda", "Reducao da Demanda"}));
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

		JFrame ofertaDemanda = new OfertaDemandaExemplo(respostaO,respostaD);
		ofertaDemanda.setVisible(true);
		dispose();
	}

}
