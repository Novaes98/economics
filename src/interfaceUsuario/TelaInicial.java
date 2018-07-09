package interfaceUsuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaInicial extends FramePrincipal {
	private JButton botaoMicroeconomia;
	private JButton botaoMacroeconomia;

	/*******************************************************************************/

	public TelaInicial() {
		initComponents();
		setTitulo("Tela inicial");
		voltar.setText("Sair");
		initButtons();
	}

	/*******************************************************************************/

	protected void initButtons() {
		botaoMicroeconomia = new JButton();
		botaoMicroeconomia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				microEconomia(e);
			}
		});
		botaoMicroeconomia.setText("Microeconomia");

		botaoMacroeconomia = new JButton();
		botaoMacroeconomia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				macroEconomia(e);
			}
		});
		botaoMacroeconomia.setText("Macroeconomia");

		LinkedList<JButton> botoes = new LinkedList<>();
		botoes.add(botaoMicroeconomia);
		botoes.add(botaoMacroeconomia);
		insereBotoes(botoes);
	}

	/*******************************************************************************/

	protected void microEconomia(ActionEvent e) {
		JFrame telaMicroeconomia = InterfaceController.controlaTelas("TelaMicroeconomia");
		telaMicroeconomia.setVisible(true);
		dispose();

	}

	/*******************************************************************************/

	protected void macroEconomia(ActionEvent e) {
		JFrame telaMacroeconomia = InterfaceController.controlaTelas("TelaMacroeconomia");
		telaMacroeconomia.setVisible(true);
		dispose();

	}

	/*******************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JOptionPane.showMessageDialog(this, "Obrigado e volte sempre! :)");

		dispose();
	}
	/*******************************************************************************/

}
