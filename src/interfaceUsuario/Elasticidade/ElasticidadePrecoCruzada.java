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

public class ElasticidadePrecoCruzada extends FrameSecundario {
	private JTextField tfProcuraInicial;
	private JTextField tfProcuraFinal;
	private JTextField tfPrecoInicial;
	private JTextField tfPrecoFinal;

	public ElasticidadePrecoCruzada() {
		inserirImagem("PrecoDemandaCruzada.jpg", width / 8 - 50, height / 3);
		inicializaExtras();
		initComponents();
		setTitulo("Elasticidade: Preco da demanda cruzada");
	}

	/*******************************************************************************/

	protected void definirTexto() {
		this.textoPrincipal = "    A elasticidade preco da demanda cruzada mensura o quanto a quantidade\n"
				+ "demandada de um bem ou servico responde a mudancas no preco de outro.\n"
				+ "    Ela eh calculada com base na porcentagem da mudanca na quantidade do\n"
				+ "produto 1 dividida pela porcentagem de mudanca no preco do bem 2,\n"
				+ "conforme formula abaixo:\n";
	}

	/*******************************************************************************/

	private void inicializaExtras() {
	
		//Insere textAreas

		String textoProcuraInicial = "Insira a quantidade inicial do produto 1";

		JTextArea procuraInicial = txtGenerico(textoProcuraInicial);
		Dimension dProcuraInicial = procuraInicial.getPreferredSize();
		JScrollPane panelProcuraInicial = caixaDeTexto(procuraInicial, width / 8, height / 3 + 100,
				dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelProcuraInicial.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelProcuraInicial);

		String textoProcuraFinal = "  Insira a quantidade final do produto 1";

		JTextArea procuraFinal = txtGenerico(textoProcuraFinal);
		JScrollPane panelProcuraFinal = caixaDeTexto(procuraFinal, width / 8 + 300, height / 3 + 100,
				dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelProcuraFinal.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelProcuraFinal);

		String textoPrecoInicial = "     Insira o preco inicial do produto 2";

		JTextArea precoInicial = txtGenerico(textoPrecoInicial);
		JScrollPane panelPrecoInicial = caixaDeTexto(precoInicial, width / 8, height / 3 + 200,
				dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelPrecoInicial.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelPrecoInicial);

		String textoPrecoFinal = "     Insira o preco final do produto 2";

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
		String txtPrecoInicial = tfPrecoInicial.getText();
		String txtPrecoFinal = tfPrecoFinal.getText();

		try {
			Validador.validaCampoInteiro(txtProcuraInicial, "Demanda Inicial do produto 1");
			Validador.validaCampoInteiro(txtProcuraFinal, "Demanda Final do produto 1");
			Validador.validaCampoDinheiro(txtPrecoInicial, "Preco Inicial  do produto 2");
			Validador.validaCampoDinheiro(txtPrecoFinal, "Preco Final do produto 2");

			int procuraInicial, procuraFinal;
			double precoInicial, precoFinal;

			procuraInicial = Integer.parseInt(txtProcuraInicial);
			procuraFinal = Integer.parseInt(txtProcuraFinal);

			precoInicial = Double.parseDouble(txtPrecoInicial);
			precoFinal = Double.parseDouble(txtPrecoFinal);

			double elasticidade = (((procuraFinal - procuraInicial) /((procuraFinal + procuraInicial)/2))/(((precoFinal - precoInicial) /((precoFinal + precoInicial)/2))));
			
			String resposta = "O valor de sua elasticidade foi de: " + elasticidade + "\n";
			
			if ((precoFinal - precoInicial) == 0 || ((procuraFinal + procuraInicial)/2) == 0)
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
