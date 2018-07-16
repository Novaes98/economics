package interfaceUsuario;

import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;
import interfaceUsuario.ISLM.islm;

import javax.swing.*;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaISLM extends FrameSecundario {
	private javax.swing.JTextArea c0, c1, T, I, G, M, P, MP;
	private javax.swing.JTextField tc0, tc1, tT, tI, tG, tM, tP, tMP;

	private javax.swing.JRadioButton zero, one, two, three, four;
	private JButton plot;

	public TelaISLM() {
		iniciarExtra();
		initComponents();

	}

	public void plottar(ActionEvent e) throws Exception {
		String type;
		if (this.zero.isSelected()) {
			type = "0";
		} else if (this.one.isSelected()) {
			type = "1";
		} else if (this.two.isSelected()) {
			type = "2";
		} else if (this.three.isSelected()) {
			type = "3";
		} else {
			type = "4";
		}
		String[] args;
		args = new String[9];
		args[0] = type;
		args[1] = this.tc0.getText();
		args[2] = this.tc1.getText();
		args[3] = this.tT.getText();
		args[4] = this.tI.getText();
		args[5] = this.tG.getText();
		args[6] = this.tM.getText();
		args[7] = this.tP.getText();
		args[8] = this.tMP.getText();
		islm.criarGrafico(args);
	}

	public void iniciarExtra() {
		int aux = 0;
		ButtonGroup buttonGroup = new ButtonGroup();

		zero = new JRadioButton("Estado inicial");
		Dimension d = zero.getPreferredSize();
		zero.setBounds(0, height / 3 + 100, d.width, d.height);
		aux = d.height;
		zero.setSelected(true);

		buttonGroup.add(zero);
		getContentPane().add(zero);

		one = new JRadioButton(
				"Aumentam despesas públicas ou consumidores não economizam ou expectativas de futuro promissor");
		d = one.getPreferredSize();
		one.setBounds(0, height / 3 + 100 + aux, d.width, d.height);
		aux += d.height;
		buttonGroup.add(one);
		getContentPane().add(one);

		two = new JRadioButton(
				"Diminuem despesas públicas ou consumidores economizarem ou expectativas de futuro negativas");
		d = two.getPreferredSize();
		two.setBounds(0, height / 3 + 100 + aux, d.width, d.height);
		aux += d.height;
		buttonGroup.add(two);
		getContentPane().add(two);

		three = new JRadioButton(
				"Banco Federal ou avanços na tecnologia de transação aumentam o estoque de dinheiro ou nível de preço diminuir");
		d = three.getPreferredSize();
		three.setBounds(0, height / 3 + 100 + aux, d.width, d.height);
		aux += d.height;
		buttonGroup.add(three);
		getContentPane().add(three);

		four = new JRadioButton("Se o Banco da Reserva Federal diminuir o estoque de dinheiro (físico) ou,\n"
				+ "o nível de preço aumentar...");
		d = four.getPreferredSize();
		four.setBounds(0, height / 3 + 100 + aux, d.width, d.height);
		buttonGroup.add(four);
		getContentPane().add(four);

		int altura = 0, largura = 0;

		c0 = new JTextArea("c0: ");
		c0.setFont(new Font("Baskerville Old Face", 0, 18));
		d = c0.getPreferredSize();
		c0.setBounds(width / 8 + largura, height / 3 + 20 + altura, d.width, d.height);
		getContentPane().add(c0);
		tc0 = new JTextField("150");
		Dimension di = tc0.getPreferredSize();
		tc0.setBounds((int) (width / 8 + largura + d.getWidth() + 10), height / 3 + 20 + altura, 50, d.height);
		getContentPane().add(tc0);
		largura += 100;

		c1 = new JTextArea("c1: ");
		c1.setFont(new Font("Baskerville Old Face", 0, 18));
		d = c1.getPreferredSize();
		c1.setBounds(width / 8 + largura, height / 3 + 20 + altura, d.width, d.height);
		getContentPane().add(c1);
		tc1 = new JTextField("0.5");
		di = tc1.getPreferredSize();
		tc1.setBounds((int) (width / 8 + largura + d.getWidth() + 10), height / 3 + 20 + altura, 50, d.height);
		getContentPane().add(tc1);
		largura += 100;

		T = new JTextArea("T: ");
		T.setFont(new Font("Baskerville Old Face", 0, 18));
		d = T.getPreferredSize();
		T.setBounds(width / 8 + largura, height / 3 + 20 + altura, d.width, d.height);
		getContentPane().add(T);
		tT = new JTextField("50");
		di = tT.getPreferredSize();
		tT.setBounds((int) (width / 8 + largura + d.getWidth() + 10), height / 3 + 20 + altura, 50, d.height);
		getContentPane().add(tT);
		largura += 100;

		I = new JTextArea("I: ");
		I.setFont(new Font("Baskerville Old Face", 0, 18));
		d = I.getPreferredSize();
		I.setBounds(width / 8 + largura, height / 3 + 20 + altura, d.width, d.height);
		getContentPane().add(I);

		tI = new JTextField("80-8*r");
		di = tI.getPreferredSize();
		tI.setBounds((int) (width / 8 + largura + d.getWidth() + 10), height / 3 + 20 + altura, 50, d.height);
		getContentPane().add(tI);
		largura = 0;
		altura += d.height;

		G = new JTextArea("G: ");
		G.setFont(new Font("Baskerville Old Face", 0, 18));
		d = G.getPreferredSize();
		G.setBounds(width / 8 + largura, height / 3 + 20 + altura, d.width, d.height);
		getContentPane().add(G);
		tG = new JTextField("70");
		di = tG.getPreferredSize();
		tG.setBounds((int) (width / 8 + largura + d.getWidth() + 10), height / 3 + 20 + altura, 50, d.height);
		getContentPane().add(tG);
		largura += 100;

		M = new JTextArea("M: ");
		M.setFont(new Font("Baskerville Old Face", 0, 18));
		d = M.getPreferredSize();
		M.setBounds(width / 8 + largura, height / 3 + 20 + altura, d.width, d.height);
		getContentPane().add(M);
		tM = new JTextField("800");
		di = tM.getPreferredSize();
		tM.setBounds((int) (width / 8 + largura + d.getWidth() + 10), height / 3 + 20 + altura, 50, d.height);
		getContentPane().add(tM);
		largura += 100;

		P = new JTextArea("P: ");
		P.setFont(new Font("Baskerville Old Face", 0, 18));
		d = P.getPreferredSize();
		P.setBounds(width / 8 + largura, height / 3 + 20 + altura, d.width, d.height);
		getContentPane().add(P);
		tP = new JTextField("2");
		di = tP.getPreferredSize();
		tP.setBounds((int) (width / 8 + largura + d.getWidth() + 10), height / 3 + 20 + altura, 50, d.height);
		getContentPane().add(tP);
		largura += 100;

		MP = new JTextArea("MP: ");
		MP.setFont(new Font("Baskerville Old Face", 0, 18));
		d = MP.getPreferredSize();
		MP.setBounds(width / 8 + largura, height / 3 + 20 + altura, d.width, d.height);
		getContentPane().add(MP);

		tMP = new JTextField("Y-20*r");
		di = tMP.getPreferredSize();
		tMP.setBounds((int) (width / 8 + largura + d.getWidth() + 10), height / 3 + 20 + altura, 50, d.height);
		getContentPane().add(tMP);

		JButton plot = new JButton("Plottar");
		d = plot.getPreferredSize();
		plot.setBounds(width / 2 - 50, height / 3 + 400, d.width, d.height);
		getContentPane().add(plot);

		plot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					plottar(e);
				} catch (Exception ex) {

				}
			}
		});

	}

	/***************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaMacroeconomia = InterfaceController.controlaTelas("TelaMacroeconomia");
		telaMacroeconomia.setVisible(true);

		dispose();
	}

	/*******************************************************************************/

	@Override
	protected void definirTexto() {
		this.textoPrincipal = "O modelo IS-LM (curto para investment-savings, liquidity preference-money supply) \n"
				+ "é um modelo macroeconômico Keynesiano que mostra a relação entre a taxa real de \n"
				+ "juros (eixo das ordenadas) e o PIB real (eixo das abscissas) de um país. A taxa real\n"
				+ "de juros se trata da taxa de juros nominal menos a taxa de inflação, e o PIB real é \n"
				+ "representado pela equação Y = C + I + G + NX tal que:\n"
				+ "\t- C (consumo) = c0 + c1(renda disponível = Y - T)\n"
				+ "\t\t- c0: consumo autônomo (gastos em necessidades básicas)\n"
				+ "\t\t- c1: propensão marginal a consumir (incremento no consumo sob o acréscimo na "
				+ "\t\t\trenda disponível)\n" + "\t- Y: renda agregada\n" + "\t- T: imposto agregado\n"
				+ "\t- I (investimento planejado) = F(r)\n" + "\t- r: taxa real de juros  \n"
				+ "\t- F(r) : função proporcionalmente inversa a r\n" + "\t- G: despesas públicas\n"
				+ "\t- NX: exportações líquidas \n" + "\n" + "Para a curva de LM, temos a seguinte equação:\n"
				+ " \tM/P = F(Y, r)  tal que M é o estoque de dinheiro (money supply) \n"
				+ "\t\te P o nível de preço. Ex.: Y - 20*r";
	}
}
