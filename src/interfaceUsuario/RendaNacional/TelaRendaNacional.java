package interfaceUsuario.RendaNacional;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;

import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;

public class TelaRendaNacional extends FrameSecundario {
	
	private JButton botaoPIB;
	private JButton botaoRendaPessoal;

	public TelaRendaNacional(){
		initComponents();
		setTitulo("Modelo de renda nacional");
		initButtons();
	}
	
	/***************************************************************************/
	
	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaMacroeconomia = InterfaceController.controlaTelas("TelaMacroeconomia");
		telaMacroeconomia.setVisible(true);

		dispose();
	}
	/*******************************************************************************/
	
	public void definirTexto(){
		this.textoPrincipal = "A renda nacional eh a soma dos rendimentos recebidos pelos proprietarios\n"
							+"dos fatores de producao pela utilizacao de servicos que tais fatores apresentam\n"
							+"De forma simplificada, a Renda Nacional (RN) eh composta por\n"
							+"salarios + juros + alugueis + lucros \r\n\n"
							+ "Para um modelo completo, temos que RN = PIB - RLe - Depreciacao - tributos +\n"
							+ "subsidios, sendo PIB = produto interno bruto e RLe = Rendas Liquidas obtidas por\n"
							+ "empresas estrangeiras enviadas para o exterior\n\n"
							+ "Clique em um dos botoes abaixo para saber mais sobre assuntos relacionados";
	}
	
	protected void initButtons() {
		botaoPIB = new JButton();
		botaoPIB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PIB(e);
			}
		});
		botaoPIB.setText("PIB");
		
		botaoRendaPessoal = new JButton();
		botaoRendaPessoal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				rendaPessoal(e);
			}
		});
		botaoRendaPessoal.setText("RendaPessoal");

		LinkedList<JButton> botoes = new LinkedList<>();
		botoes.add(botaoPIB);
		botoes.add(botaoRendaPessoal);

		insereBotoes(botoes);
	}

	protected void rendaPessoal(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	protected void PIB(ActionEvent e) {
		JFrame PIB = InterfaceController.controlaTelas("TelaPIB");
		PIB.setVisible(true);
		dispose();
				
	}
	
}
