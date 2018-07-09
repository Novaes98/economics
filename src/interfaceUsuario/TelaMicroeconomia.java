package interfaceUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaMicroeconomia extends FramePrincipal {
	private JButton botaoOfertaVsDemanda;
	private JButton botaoElasticidade;

	/*******************************************************************************/

	public TelaMicroeconomia() {
		initComponents();
		setTitulo("MICROECONOMIA");
		initButtons();
	}

	/*******************************************************************************/

	protected void initButtons() {
		botaoOfertaVsDemanda = new JButton();
		botaoOfertaVsDemanda.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ofertaVsDemanda(e);
			}
		});
		botaoOfertaVsDemanda.setText("Oferta Vs Demanda");

		botaoElasticidade = new JButton();
		botaoElasticidade.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				elasticidade(e);
			}
		});
		botaoElasticidade.setText("Elasticidade");

		LinkedList<JButton> botoes = new LinkedList<>();
		botoes.add(botaoOfertaVsDemanda);
		botoes.add(botaoElasticidade);
		insereBotoes(botoes);
	}

	/*******************************************************************************/

	protected void ofertaVsDemanda(ActionEvent e) {
		JFrame telaMicroeconomia = InterfaceController.controlaTelas("TelaOfertaVsDemanda");
		telaMicroeconomia.setVisible(true);
	}

	/*******************************************************************************/

	protected void elasticidade(ActionEvent e) {
		JFrame telaMacroeconomia = InterfaceController.controlaTelas("TelaElasticidade");
		telaMacroeconomia.setVisible(true);
	}

	/*******************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaMacroeconomia = InterfaceController.controlaTelas("TelaInicial");
		telaMacroeconomia.setVisible(true);

		dispose();
	}
	/*******************************************************************************/

}
