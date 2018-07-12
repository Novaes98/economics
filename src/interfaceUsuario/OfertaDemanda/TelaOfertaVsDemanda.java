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

		initComponents();
		iniciarExtra();
		setTitulo("Curva de oferta e demanda");
	}

	/***************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaMicroeconomia = InterfaceController.controlaTelas("TelaMicroeconomia");
		telaMicroeconomia.setVisible(true);

		dispose();
	}

	/*******************************************************************************/

	public void definirTexto() {
		this.textoPrincipal = "Era uma vez um porquinho legal.";
	}

	public void iniciarExtra() {
		cBoxOferta = new javax.swing.JComboBox<>();
		cBoxOferta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
		Dimension O = cBoxOferta.getPreferredSize();
		cBoxOferta.setBounds(width / 8, height / 3 + 100, O.width, O.height);
		getContentPane().add(cBoxOferta);

		cBoxDemanda = new javax.swing.JComboBox<>();
		cBoxDemanda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
		Dimension D = cBoxDemanda.getPreferredSize();
		cBoxDemanda.setBounds(width / 8 + 300, height / 3 + 100, D.width, D.height);
		getContentPane().add(cBoxDemanda);

		JButton btnPlottar = new JButton("Plottar");
		Dimension d = btnPlottar.getPreferredSize();
		btnPlottar.setBounds(width / 2 - 50, height / 3 + 200, d.width, d.height);
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

		JFrame ofertaDemanda =new OfertaDemandaExemplo(respostaO,respostaD);
		ofertaDemanda.setVisible(true);
		dispose();
	}

}
