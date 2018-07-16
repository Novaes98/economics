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
		this.textoPrincipal = "    A elasticidade preço da demanda cruzada mensura o quanto a quantidade\n"
				+ "demandada de um bem ou serviço responde a mudanças no preço de outro.\n"
				+ "    Ela é calculada com base na porcentagem da mudança na quantidade do\n"
				+ "produto 1 dividida pela porcentagem de mudança no preço do bem 2,\n" + "conforme fórmula abaixo:\n";
	}

	/*******************************************************************************/

	private void inicializaExtras() {

		// Insere textAreas

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

		// Insere TextFields

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

			double procuraInicial, procuraFinal, precoInicial, precoFinal;

			procuraInicial = Double.parseDouble(txtProcuraInicial);
			procuraFinal = Double.parseDouble(txtProcuraFinal);

			precoInicial = Double.parseDouble(txtPrecoInicial);
			precoFinal = Double.parseDouble(txtPrecoFinal);

			double parteDeCima = (procuraFinal - procuraInicial) / ((procuraFinal + procuraInicial) / 2);
			double parteDeBaixo = (precoFinal - precoInicial) / ((precoFinal + precoInicial) / 2);
			double elasticidade = parteDeCima / parteDeBaixo;

			String resposta = "O valor de sua elasticidade foi de: " + elasticidade + "\n";

			if ((precoFinal - precoInicial) == 0 || ((procuraFinal + procuraInicial) / 2) == 0)
				resposta += "Uma elasticidade infinita significa que ela é perfeitamente elástica "
						+ "e que a quantidade demandada é infinita no determinado preço";
			else if (elasticidade > 0)
				resposta += "Uma elasticidade positiva significa que se trata entre bens "
						+ "substitutos e a quantidade demandada do bem 1 cresce com o aumento do preço do bem 2";
			else if (elasticidade < 0)
				resposta += "Uma elasticidade negativa significa que se trata entre bens"
						+ "complementares e a quantidade demandada do bem 1 diminui com o aumento do preço do bem 2";
			else
				resposta += "Uma elasticidade nula significa que os bens são independentes";

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
