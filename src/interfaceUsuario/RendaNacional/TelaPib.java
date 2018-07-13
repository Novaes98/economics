package interfaceUsuario.RendaNacional;

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

public class TelaPib extends FrameSecundario {

	private JTextField tfQtdProdutoA;
	private JTextField tfQtdProdutoB;
	private JTextField tfPrecoA;
	private JTextField tfPrecoB;

	/*******************************************************************************/

	public TelaPib() {
		inserirImagem("PIB.jpg", width / 5 + 20, height / 3 + 19);
		initComponents();
		setTitulo("Calculo do Produto Interno Bruto (PIB)");
		inicializaExtras();
	}

	/*******************************************************************************/

	@Override
	protected void definirTexto() {
		this.textoPrincipal = "O Produto Interno Bruto (PIB) eh um indicador para medir a atividade economica de\n"
				+ "um pais, podendo ser calculado pela soma de suas riquezas produzidas (empresas\n"
				+ "nacionais e estrangeiras) ou pela ótiica da demanda, ou seja: quem compra\n"
				+ "essas riquezas (consumo interno, do governo, investimentos e as importacoes\n"
				+ "e exportacoes).\n\nO PIB nominal eh calculado a precos correntes, isto eh, no ano em que o produto\n"
				+ "foi produzido e comercializado.\n"
				+ "O PIB real eh calculado a precos constantes, sendo escolhido um ano base para\n"
				+ "o calculo e assim eliminando o efeito da inflacao.\n\n"
				+ "O deflator do PIB eh uma forma de medir o nivel geral de precos, sendo obtido\n"
				+ "a partir da divisao entre o PIB nominal e o PIB real multiplicado por cem.\n"
				+ "Essa medida eh utilizada para estimar a valorizacao dos produtos em um\n"
				+ "certo intervalo de tempo.\n\n"
				+ "Por exemplo, para calcular o PIB nominal de 2 bens, basta inserir a quantidade e o\n"
				+ "preco de cada produto nos campos abaixo.\n"
				+ "Para calcular o PIB real, multiplique a quantidade de cada ano pelo preco de um ano\n" + "fixo";

	}

	/*******************************************************************************/

	private void inicializaExtras() {

		// Insere textAreas

		String textoQtdProdutoA = "Insira a quantidade do produto A        ";

		JTextArea qtdProdutoA = txtGenerico(textoQtdProdutoA);
		Dimension dQtdProdutoA = qtdProdutoA.getPreferredSize();
		JScrollPane panelQtdProdutoA = caixaDeTexto(qtdProdutoA, width / 8, height / 3 + 200, dQtdProdutoA.width + 10,
				dQtdProdutoA.height + 5);
		panelQtdProdutoA.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelQtdProdutoA);

		String textoQtdProdutoB = "Insira a quantidade do produto B";
		JTextArea qtdProdutoB = txtGenerico(textoQtdProdutoB);
		JScrollPane panelQtdProdutoB = caixaDeTexto(qtdProdutoB, width / 8 + 300, height / 3 + 200,
				dQtdProdutoA.width + 10, dQtdProdutoA.height + 5);
		panelQtdProdutoB.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelQtdProdutoB);

		String textoPrecoA = "Insira um valor para o preco de A";

		JTextArea precoA = txtGenerico(textoPrecoA);
		JScrollPane panelPrecoA = caixaDeTexto(precoA, width / 8, height / 3 + 300, dQtdProdutoA.width + 10,
				dQtdProdutoA.height + 5);
		panelPrecoA.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelPrecoA);

		String textoPrecoFinal = "Insira um valor para o preco de B";

		JTextArea precoB = txtGenerico(textoPrecoFinal);
		JScrollPane panelPrecoB = caixaDeTexto(precoB, width / 8 + 300, height / 3 + 300, dQtdProdutoA.width + 10,
				dQtdProdutoA.height + 5);
		panelPrecoB.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelPrecoB);

		// Insere TextFields

		tfQtdProdutoA = new JTextField();
		tfQtdProdutoA.setBounds(width / 8, height / 3 + 225, dQtdProdutoA.width + 10, dQtdProdutoA.height + 5);
		tfQtdProdutoA.setText("Digite um numero inteiro positivo");
		getContentPane().add(tfQtdProdutoA);

		tfQtdProdutoB = new JTextField();
		tfQtdProdutoB.setBounds(width / 8 + 300, height / 3 + 225, dQtdProdutoA.width + 10, dQtdProdutoA.height + 5);
		tfQtdProdutoB.setText("Digite um numero inteiro positivo");
		getContentPane().add(tfQtdProdutoB);

		tfPrecoA = new JTextField();
		tfPrecoA.setBounds(width / 8, height / 3 + 325, dQtdProdutoA.width + 10, dQtdProdutoA.height + 5);
		tfPrecoA.setText("Formato ##.## ou um inteiro positivo");
		getContentPane().add(tfPrecoA);

		tfPrecoB = new JTextField();
		tfPrecoB.setBounds(width / 8 + 300, height / 3 + 325, dQtdProdutoA.width + 10, dQtdProdutoA.height + 5);
		tfPrecoB.setText("Formato ##.## ou um inteiro positivo");

		getContentPane().add(tfPrecoB);

		JButton btnCalcular = new JButton("Calcular");
		Dimension d = btnCalcular.getPreferredSize();
		btnCalcular.setBounds(width / 2 - 50, height / 3 + 450, d.width, d.height);
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
		String txtQtdA = tfQtdProdutoA.getText();
		String txtQtdB = tfQtdProdutoB.getText();
		String txtPrecoA = tfPrecoA.getText();
		String txtPrecoB = tfPrecoB.getText();

		try {
			Validador.validaCampoInteiro(txtQtdA, "Quantidade de A");
			Validador.validaCampoInteiro(txtQtdB, "Quantidade de B");
			Validador.validaCampoDinheiro(txtPrecoA, "Preco de A");
			Validador.validaCampoDinheiro(txtPrecoB, "Preco de B");

			int qtdA, qtdB;
			double precoA, precoB;

			qtdA = Integer.parseInt(txtQtdA);
			qtdB = Integer.parseInt(txtQtdB);

			precoA = Double.parseDouble(txtPrecoA);
			precoB = Double.parseDouble(txtPrecoB);

			double PIB = (qtdA * precoA) + (qtdB * precoB);

			String resposta = "O valor do PIB foi de: " + PIB + "\n";

			JOptionPane.showMessageDialog(this, resposta);
			limparCampos();

		} catch (ValidacaoException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}

	}

	/*******************************************************************************/

	private void limparCampos() {
		tfQtdProdutoA.setText("Digite um numero inteiro positivo");
		tfQtdProdutoB.setText("Digite um numero inteiro positivo");
		tfPrecoA.setText("Digite no formato ##.## ou um inteiro positivo");
		tfPrecoB.setText("Digite no formato ##.## ou um inteiro positivo");
	}

	/*******************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaElasticidade = InterfaceController.controlaTelas("TelaMacroeconomia");
		telaElasticidade.setVisible(true);

		dispose();
	}
	/*******************************************************************************/

}
