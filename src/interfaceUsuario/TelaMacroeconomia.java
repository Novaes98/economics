package interfaceUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaMacroeconomia extends FramePrincipal {
	private JButton botaoRendaNacional;
	private JButton botaoMundell;
	private JButton botaoInflacao;

	/*******************************************************************************/

	public TelaMacroeconomia() {
		initComponents();
		setTitulo("MACROECONOMIA");
		initButtons();
	}

	/*******************************************************************************/

	protected void initButtons() {
		botaoRendaNacional = new JButton();
		botaoRendaNacional.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				rendaNacional(e);
			}
		});
		botaoRendaNacional.setText("Renda Nacional");

		botaoMundell = new JButton();
		botaoMundell.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mundellFleming(e);
			}
		});
		botaoMundell.setText("Modelo de Mundell-Fleming");

		botaoInflacao = new JButton();
		botaoInflacao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				inflacao(e);
			}
		});
		botaoInflacao.setText("Calcular Inflacao");

		LinkedList<JButton> botoes = new LinkedList<>();
		botoes.add(botaoRendaNacional);
		botoes.add(botaoMundell);
		botoes.add(botaoInflacao);
		insereBotoes(botoes);
	}

	/*******************************************************************************/

	protected void rendaNacional(ActionEvent e) {
		JFrame telaRendaNacional = InterfaceController.controlaTelas("TelaRendaNacional");
		telaRendaNacional.setVisible(true);
		dispose();
	}

	/*******************************************************************************/

	protected void mundellFleming(ActionEvent e) {
		JFrame telaMundellFleming = InterfaceController.controlaTelas("TelaMundellFleming");
		telaMundellFleming.setVisible(true);
		dispose();
	}

	/*******************************************************************************/

	protected void inflacao(ActionEvent e) {
		JFrame telaInflacao = InterfaceController.controlaTelas("TelaInflacao");
		telaInflacao.setVisible(true);
		dispose();

	}

	/*******************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaInicial = InterfaceController.controlaTelas("TelaInicial");
		telaInicial.setVisible(true);

		dispose();
	}
	/*******************************************************************************/

}
