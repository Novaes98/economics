package interfaceUsuario.Elasticidade;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;
import interfaceUsuario.ValidacaoException;
import interfaceUsuario.Validador;

public class ElasticidadePrecoDemanda extends FrameSecundario {
	private JTextField tfProcuraInicial;
	private JTextField tfProcuraFinal;
	private JTextField tfPrecoInicial;
	private JTextField tfPrecoFinal;
	private JTextField tfProcuraAtual;
	private JTextField tfPrecoAtual;

	public ElasticidadePrecoDemanda() {

		inserirImagem("Elasticidade_preco_demanda.jpg", width / 8 - 50, height / 3);
		inicializaExtras();
		initComponents();
		setTitulo("Elasticidade: Preco na demanda");

	}

	/*******************************************************************************/

	protected void definirTexto() {
		this.textoPrincipal = "    A elasticidade do preço na procura serve para mensurar o quanto a demanda\n "
				+ "por um bem ou serviço varia em relção às mudanças no preço destes, supondo \n"
				+ "que todas as outras variáveis envolvidas permaneçam constantes.\n"
				+ "    As elasticidades do preço são quase sempre negativas, ou seja, quanto\n"
				+ "maior o preço do bem ou serviço, menor a procura.";
	}

	/*******************************************************************************/

	private void inicializaExtras() {
		String textoProcuraInicial = "Insira um valor para a quantidade inicial";

		JTextArea procuraInicial = txtGenerico(textoProcuraInicial);
		Dimension dProcuraInicial = procuraInicial.getPreferredSize();
		JScrollPane panelProcuraInicial = caixaDeTexto(procuraInicial, width / 8, height / 3 + 100,
				dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelProcuraInicial.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelProcuraInicial);

		String textoProcuraFinal = "  Insira um valor para a quantidade final";

		JTextArea procuraFinal = txtGenerico(textoProcuraFinal);
		JScrollPane panelProcuraFinal = caixaDeTexto(procuraFinal, width / 8 + 300, height / 3 + 100,
				dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelProcuraFinal.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelProcuraFinal);

		String textoPrecoInicial = "     Insira um valor para o preco inicial";

		JTextArea precoInicial = txtGenerico(textoPrecoInicial);
		JScrollPane panelPrecoInicial = caixaDeTexto(precoInicial, width / 8, height / 3 + 200,
				dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelPrecoInicial.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelPrecoInicial);

		String textoPrecoFinal = "     Insira um valor para o preco final";

		JTextArea precoFinal = txtGenerico(textoPrecoFinal);
		JScrollPane panelPrecoFinal = caixaDeTexto(precoFinal, width / 8 + 300, height / 3 + 200,
				dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelPrecoFinal.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelPrecoFinal);

		String textoProcuraAtual = "     Insira um valor para a procura atual";

		JTextArea procuraAtual = txtGenerico(textoProcuraAtual);
		JScrollPane panelProcuraAtual = caixaDeTexto(procuraAtual, width / 8, height / 3 + 300,
				dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelProcuraAtual.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelProcuraAtual);

		String textoPrecoAtual = "     Insira um valor para o preco atual";

		JTextArea precoAtual = txtGenerico(textoPrecoAtual);
		JScrollPane panelPrecoAtual = caixaDeTexto(precoAtual, width / 8 + 300, height / 3 + 300,
				dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelPrecoAtual.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelPrecoAtual);

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

		tfProcuraAtual = new JTextField();
		tfProcuraAtual.setBounds(width / 8, height / 3 + 325, dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		tfProcuraAtual.setText("Digite um numero inteiro positivo");
		getContentPane().add(tfProcuraAtual);

		tfPrecoAtual = new JTextField();
		tfPrecoAtual.setBounds(width / 8 + 300, height / 3 + 325, dProcuraInicial.width + 10,
				dProcuraInicial.height + 5);
		tfPrecoAtual.setText("Digite no formato ##.## ou um inteiro positivo");

		getContentPane().add(tfPrecoAtual);

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
		String txtProcuraAtual = tfProcuraAtual.getText();
		String txtPrecoAtual = tfPrecoAtual.getText();

		try {
			Validador.validaCampoInteiro(txtProcuraInicial, "Procura Inicial");
			Validador.validaCampoInteiro(txtProcuraFinal, "Procura Final");
			Validador.validaCampoDinheiro(txtPrecoInicial, "Preco Inicial");
			Validador.validaCampoDinheiro(txtPrecoFinal, "Preco Final");
			Validador.validaCampoInteiro(txtProcuraAtual, "Procura Atual");
			Validador.validaCampoDinheiro(txtPrecoAtual, "Preco Atual");

			int procuraInicial, procuraFinal, procuraAtual;
			double precoInicial, precoFinal, precoAtual;

			procuraInicial = Integer.parseInt(txtProcuraInicial);
			procuraFinal = Integer.parseInt(txtProcuraFinal);
			procuraAtual = Integer.parseInt(txtProcuraAtual);

			precoInicial = Double.parseDouble(txtPrecoInicial);
			precoFinal = Double.parseDouble(txtPrecoFinal);
			precoAtual = Double.parseDouble(txtPrecoAtual);

			double elasticidade = ((precoFinal - precoInicial) * procuraAtual)
					/ ((procuraFinal - procuraInicial) * precoAtual);
			
			String resposta = "O valor de sua elasticidade foi de: " + elasticidade + "\n";
			
			if ((procuraFinal - procuraInicial) == 0 || precoAtual == 0)
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
		tfProcuraAtual.setText("Digite um numero inteiro positivo");
		tfPrecoAtual.setText("Digite no formato ##.## ou um inteiro positivo");
	}

	/*******************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaElasticidade = InterfaceController.controlaTelas("TelaElasticidade");
		telaElasticidade.setVisible(true);

		dispose();
	}

	/*******************************************************************************/

}
