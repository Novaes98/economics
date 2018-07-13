package interfaceUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaMacroeconomia extends FramePrincipal {
	private JButton botaoRendaNacional;
	private JButton botaoISLM;
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
				PIB(e);
			}
		});
		botaoRendaNacional.setText("PIB");

		botaoISLM = new JButton();
		botaoISLM.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ISLM(e);
			}
		});
		botaoISLM.setText("IS-LM");

		botaoInflacao = new JButton();
		botaoInflacao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				inflacao(e);
			}
		});
		botaoInflacao.setText("Deflator/Inflacao/Deflacao");

		LinkedList<JButton> botoes = new LinkedList<>();
		botoes.add(botaoRendaNacional);
		botoes.add(botaoISLM);
		botoes.add(botaoInflacao);
		insereBotoes(botoes);
	}

	/*******************************************************************************/

	protected void PIB(ActionEvent e) {
		JFrame PIB = InterfaceController.controlaTelas("TelaPIB");
		PIB.setVisible(true);
		dispose();
	}

	/*******************************************************************************/

	protected void ISLM(ActionEvent e) {
		JFrame telaISLM = InterfaceController.controlaTelas("TelaISLM");
		telaISLM.setVisible(true);
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
