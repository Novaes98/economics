package interfaceUsuario.Elasticidade;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;
import interfaceUsuario.ValidacaoException;
import interfaceUsuario.Validador;

public class ElasticidadeProcuraRendimento extends FrameSecundario {
	private JTextField tfProcuraInicial;
	private JTextField tfProcuraFinal;
	private JTextField tfPrecoInicial;
	private JTextField tfPrecoFinal;

	public ElasticidadeProcuraRendimento() {
		inserirImagem("rendaDemanda.jpg", width / 8 - 50, height / 3);
		inicializaExtras();
		initComponents();
		setTitulo("Elasticidade: Rendimento da procura");
	}

	/*******************************************************************************/

	protected void definirTexto() {
		this.textoPrincipal = "    Normalmente existe uma relação direta entre o rendimento e a quantidade\n"
				+ "procurada, ou seja, o valor da elasticidade procura rendimento é maior que zero (ou positiva):\n"
				+ "se a renda aumenta, a demanda aumenta; se a renda diminui, a demanda também\n"
				+ "diminui, na mesma proporção.";

	}

	/*******************************************************************************/

	private void inicializaExtras() {
		
		//Insere textAreas
		
		String textoProcuraInicial = "Insira um valor para a demanda inicial";

		JTextArea procuraInicial = txtGenerico(textoProcuraInicial);
		Dimension dProcuraInicial = procuraInicial.getPreferredSize();
		JScrollPane panelProcuraInicial = caixaDeTexto(procuraInicial, width / 8, height / 3 + 100,
				dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelProcuraInicial.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelProcuraInicial);

		String textoProcuraFinal = "  Insira um valor para a demanda final";

		JTextArea procuraFinal = txtGenerico(textoProcuraFinal);
		JScrollPane panelProcuraFinal = caixaDeTexto(procuraFinal, width / 8 + 300, height / 3 + 100,
				dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelProcuraFinal.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelProcuraFinal);

		String textoPrecoInicial = "     Insira um valor para a renda inicial";

		JTextArea precoInicial = txtGenerico(textoPrecoInicial);
		JScrollPane panelPrecoInicial = caixaDeTexto(precoInicial, width / 8, height / 3 + 200,
				dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelPrecoInicial.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelPrecoInicial);

		String textoPrecoFinal = "     Insira um valor para a renda final";

		JTextArea precoFinal = txtGenerico(textoPrecoFinal);
		JScrollPane panelPrecoFinal = caixaDeTexto(precoFinal, width / 8 + 300, height / 3 + 200,
				dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelPrecoFinal.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelPrecoFinal);

		//Insere TextFields
		
		tfProcuraInicial = new JTextField();
		tfProcuraInicial.setBounds(width / 8, height / 3 + 125, dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		tfProcuraInicial.setText("Digite um numero inteiro positivo");
		getContentPane().add(tfProcuraInicial);

		tfProcuraFinal = new JTextField();
		tfProcuraFinal.setBounds(width / 8 + 300, height / 3 + 125, dProcuraInicial.width + 10,
				dProcuraInicial.height + 5);
		tfProcuraFinal.setText("Digite um numero inteiro positivo");
		getContentPane().add(tfProcuraFinal);

		tfPrecoInicial = new JTextField();
		tfPrecoInicial.setBounds(width / 8, height / 3 + 225, dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		tfPrecoInicial.setText("Digite no formato ##.## ou um inteiro positivo");
		getContentPane().add(tfPrecoInicial);

		tfPrecoFinal = new JTextField();
		tfPrecoFinal.setBounds(width / 8 + 300, height / 3 + 225, dProcuraInicial.width + 10,
				dProcuraInicial.height + 5);
		tfPrecoFinal.setText("Digite no formato ##.## ou um inteiro positivo");

		getContentPane().add(tfPrecoFinal);

		JButton btnCalcular = new JButton("Calcular");
		Dimension d = btnCalcular.getPreferredSize();
		btnCalcular.setBounds(width / 2 - 50, height / 3 + 400, d.width, d.height);
		getContentPane().add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcular(e);
			}
		});

	}

	/*******************************************************************************/

	private void calcular(ActionEvent e) {
		String txtProcuraInicial = tfProcuraInicial.getText();
		String txtProcuraFinal = tfProcuraFinal.getText();
		String txtRendaInicial = tfPrecoInicial.getText();
		String txtRendaFinal = tfPrecoFinal.getText();

		try {
			Validador.validaCampoInteiro(txtProcuraInicial, "Demanda Inicial");
			Validador.validaCampoInteiro(txtProcuraFinal, "Demanda Final");
			Validador.validaCampoDinheiro(txtRendaInicial, "Renda Inicial");
			Validador.validaCampoDinheiro(txtRendaFinal, "renda Final");

			double procuraInicial, procuraFinal, rendaInicial, rendaFinal;
			
			procuraInicial = Double.parseDouble(txtProcuraInicial);
			procuraFinal = Double.parseDouble(txtProcuraFinal);

			rendaInicial = Double.parseDouble(txtRendaInicial);
			rendaFinal = Double.parseDouble(txtRendaFinal);

			double parteDeCima = (procuraFinal - procuraInicial) / ((procuraFinal + procuraInicial)/2);
			double parteDeBaixo = (rendaFinal - rendaInicial) /((rendaFinal + rendaInicial)/2);
			double elasticidade = parteDeCima / parteDeBaixo;
			
			String resposta = "O valor de sua elasticidade foi de: " + elasticidade + "\n";
			
			if ((rendaFinal - rendaInicial) == 0 || ((procuraFinal + procuraInicial)/2) == 0)
				resposta += "Uma elasticidade infinita significa";
			else if (elasticidade == 1)
				resposta += "Uma elasticidade unitaria significa";
			else if (elasticidade > 0)
				resposta += "Uma elasticidade positiva significa";
			else if (elasticidade == 0)
				resposta += "Uma elasticidade nula significa";
			else
				resposta += "Uma elasticidade negativa significa";

			JOptionPane.showMessageDialog(this, resposta);
			limparCampos();

		} catch (ValidacaoException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}

	}

	/*******************************************************************************/

	private void limparCampos() {
		tfProcuraInicial.setText("Digite um numero inteiro positivo");
		tfProcuraFinal.setText("Digite um numero inteiro positivo");
		tfPrecoInicial.setText("Digite no formato ##.## ou um inteiro positivo");
		tfPrecoFinal.setText("Digite no formato ##.## ou um inteiro positivo");
	}

	/*******************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaElasticidade = InterfaceController.controlaTelas("TelaElasticidade");
		telaElasticidade.setVisible(true);

		dispose();
	}

	/*******************************************************************************/

}
