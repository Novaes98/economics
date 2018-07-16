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

	public ElasticidadePrecoDemanda() {

		inserirImagem("PrecoDemanda.jpg", width / 8 - 50, height / 3);
		inicializaExtras();
		initComponents();
		setTitulo("Elasticidade: Preco na demanda");

	}

	/*******************************************************************************/

	protected void definirTexto() {
		this.textoPrincipal = "    A elasticidade do preço na demanda serve para mensurar o quanto a demanda\n "
				+ "por um bem ou serviço varia em relação às mudancas no preco destes, supondo \n"
				+ "que todas as outras variaveis envolvidas permanecem constantes.\n"
				+ "    As elasticidades do preco sao quase sempre negativas, ou seja, quanto\n"
				+ "maior o preco do bem ou servico, menor a procura.";
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
			Validador.validaCampoInteiro(txtProcuraInicial, "Procura Inicial");
			Validador.validaCampoInteiro(txtProcuraFinal, "Procura Final");
			Validador.validaCampoDinheiro(txtPrecoInicial, "Preco Inicial");
			Validador.validaCampoDinheiro(txtPrecoFinal, "Preco Final");

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
				resposta += "Uma elasticidade infinita significa que ela é perfeitamente elástica e que a quantidade demandada é infinita no determinado preço";
			else if (elasticidade > 1)
				resposta += "Uma elasticidade elástica significa que há uma variação de 1% no preço que corresponde uma variação superior a 1% na quantidade oferecida";
			else if (elasticidade == 1)
				resposta += "Uma elasticidade unitária significa que há uma variação de 1% no preço, corresponde a uma variação de 1% na quantidade oferecida";
			else if (1 > elasticidade && elasticidade > 0)
				resposta += "Uma elasticidade rígida significa que há uma variação de 1% no preço que corresponde uma variação inferior a 1% na quantidade oferecida";
			else if (elasticidade == 0)
				resposta += "Uma elasticidade nula significa que ela é perfeitamente inelástica e que deixa inalterada a quantidade demanda";
			else
				resposta += "Uma elasticidade negativa não existe";

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
