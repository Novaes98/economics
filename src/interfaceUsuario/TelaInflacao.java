package interfaceUsuario;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaInflacao extends FrameSecundario {
	private JTextField tfPIBNominal1;
	private JTextField tfPIBNominal2;
	private JTextField tfPIBReal1;
	private JTextField tfPIBReal2;


	public TelaInflacao() {
		
		inserirImagem("deflator.jpg", width / 8 - 50, height / 3);
		inicializaExtras();
		initComponents();
		setTitulo("Inflacao");
	}

	/***************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaMacroeconomia = InterfaceController.controlaTelas("TelaMacroeconomia");
		telaMacroeconomia.setVisible(true);

		dispose();
	}
	
	public void inicializaExtras(){
		String textoPIBNominal1 = "Insira o PIB Nominal do ano 1";

		JTextArea tAPIBNominal1 = txtGenerico(textoPIBNominal1);
		Dimension dPIBNominal1 = tAPIBNominal1.getPreferredSize();
		JScrollPane panelPIBNominal1 = caixaDeTexto(tAPIBNominal1, width / 8, height / 3 + 200,
				dPIBNominal1.width + 10, dPIBNominal1.height + 5);
		panelPIBNominal1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelPIBNominal1);
		

		tfPIBNominal1 = new JTextField();
		tfPIBNominal1.setBounds(width / 8, height / 3 + 225, dPIBNominal1.width + 10, dPIBNominal1.height + 5);
		tfPIBNominal1.setText("Digite um numero inteiro positivo");
		getContentPane().add(tfPIBNominal1);
		
		
		String textoPIBNominal2 = "Insira o PIB Nominal do ano 2";

		JTextArea tAPIBNominal2 = txtGenerico(textoPIBNominal2);
		JScrollPane panelPIBNominal2 = caixaDeTexto(tAPIBNominal2, width / 8 + 300, height / 3 + 200,
				dPIBNominal1.width + 10, dPIBNominal1.height + 5);
		panelPIBNominal2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelPIBNominal2);
		

		tfPIBNominal2 = new JTextField();
		tfPIBNominal2.setBounds(width / 8 + 300, height / 3 + 225, dPIBNominal1.width + 10, dPIBNominal1.height + 5);
		tfPIBNominal2.setText("Digite um numero inteiro positivo");
		getContentPane().add(tfPIBNominal2);
		
		String textoPIBReal1 = "Insira o PIB Real do ano 1";

		JTextArea tAPIBReal1 = txtGenerico(textoPIBReal1);
		JScrollPane panelPIBReal1 = caixaDeTexto(tAPIBReal1, width / 8, height / 3 + 300,
				dPIBNominal1.width + 10, dPIBNominal1.height + 5);
		panelPIBReal1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelPIBReal1);
		

		tfPIBReal1 = new JTextField();
		tfPIBReal1.setBounds(width / 8, height / 3 + 325, dPIBNominal1.width + 10, dPIBNominal1.height + 5);
		tfPIBReal1.setText("Digite um numero inteiro positivo");
		getContentPane().add(tfPIBReal1);
		
		
		String textoPIBReal2 = "Insira o PIB Real do ano 2";

		JTextArea tAPIBReal2 = txtGenerico(textoPIBReal2);
		JScrollPane panelPIBReal2 = caixaDeTexto(tAPIBReal2, width / 8 + 300, height / 3 + 300,
				dPIBNominal1.width + 10, dPIBNominal1.height + 5);
		panelPIBReal2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane().add(panelPIBReal2);

		tfPIBReal2 = new JTextField();
		tfPIBReal2.setBounds(width / 8 + 300, height / 3 + 325, dPIBNominal1.width + 10, dPIBNominal1.height + 5);
		tfPIBReal2.setText("Digite um numero inteiro positivo");
		getContentPane().add(tfPIBReal2);
		
		
		JButton btnDeflator1 = new JButton("Deflator 1");
		Dimension d = btnDeflator1.getPreferredSize();
		btnDeflator1.setBounds(width / 8, height / 3 + 400, d.width, d.height);
		getContentPane().add(btnDeflator1);
		btnDeflator1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				botaoDeflator1(e);
			}
		});

		JButton btnDeflator2 = new JButton("Deflator 2");
		d = btnDeflator2.getPreferredSize();
		btnDeflator2.setBounds(width / 2 - 75, height / 3 + 400, d.width, d.height);
		getContentPane().add(btnDeflator2);
		btnDeflator2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				botaoDeflator2(e);
			}
		});
		
		JButton btnInflacao = new JButton("Inflacao");
		d = btnInflacao.getPreferredSize();
		btnInflacao.setBounds(width / 8 + 400, height / 3 + 400, d.width, d.height);
		getContentPane().add(btnInflacao);
		btnInflacao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				botaoInflacao(e);
			}
		});

	}
	
	
	private void botaoDeflator1(ActionEvent e){
		
	}
	
	private void botaoDeflator2(ActionEvent e){
		
	}
	
	private void botaoInflacao(ActionEvent e){
		String txtPIBNominal = tfPIBNominal1.getText();
		String txtPIBNominal2 = tfPIBNominal2.getText();
		String txtPIBReal1 = tfPIBReal1.getText();
		String txtPIBReal2 = tfPIBReal2.getText();
		
		try {
			Validador.validaCampoDinheiro(txtPIBNominal, "PIB Nominal do ano 1");
			Validador.validaCampoDinheiro(txtPIBNominal2, "PIB Nominal do ano 2");
			Validador.validaCampoDinheiro(txtPIBReal1, "PIB Real do ano 1");
			Validador.validaCampoDinheiro(txtPIBReal2, "PIB Real do ano 2");

			double pibNominal1, pibNominal2, pibReal1, pibReal2, inflacao;

			pibNominal1=  Double.parseDouble(txtPIBNominal);
			pibNominal2 =  Double.parseDouble(txtPIBNominal2);

			pibReal1 = Double.parseDouble(txtPIBReal1);
			pibReal2 = Double.parseDouble(txtPIBReal1);
			
			inflacao = calculaInflacao(calculaDeflator(pibReal1,pibNominal1), calculaDeflator(pibReal2,pibNominal2));
		
				
			String resposta = "O valor da taxa inflacao, para o ano 2 foi de: " + inflacao + "\n";
		
			JOptionPane.showMessageDialog(this, resposta);
			limparCampos();

		} catch (ValidacaoException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}
	private double calculaDeflator(double pibReal, double pibNominal){
		return pibNominal/pibReal*100;
	}
	
	private double calculaInflacao(double deflator1, double deflator2){
		return (deflator2 - deflator1) / deflator1;
	}
	
	/*******************************************************************************/

	private void limparCampos() {
		tfPIBNominal1.setText("Digite no formato ##.## ou um inteiro positivo");
		tfPIBNominal2.setText("Digite no formato ##.## ou um inteiro positivo");
		tfPIBReal1.setText("Digite no formato ##.## ou um inteiro positivo");
		tfPIBReal2.setText("Digite no formato ##.## ou um inteiro positivo");
	}

	/*******************************************************************************/

	public void definirTexto() {
		this.textoPrincipal = "    Com base nos valores de PIB nominal e PIB real de um ano, é possível calcular\n"
				+ "o deflator do PIB. O deflator é usado para medir a inflação ou a desvalorização da\n"
				+ "moeda O cálculo da inflação é feito com base na fórmula abaixo:";
	}
	/**********************/  /***********************************************************************************/    /*********************************************************************************/   /*********************************************************************************/      /*********************************************************************************/     /*********************************************************************************/   /*********************************************************************************/     /*********************************************************************************/      /*********************************************************************************//*********************************************************************************/       /*********************************************************************************/ 

	
	
}
