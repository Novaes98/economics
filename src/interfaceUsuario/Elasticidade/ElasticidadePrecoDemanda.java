package interfaceUsuario.Elasticidade;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;

public class ElasticidadePrecoDemanda extends FrameSecundario {

	public ElasticidadePrecoDemanda() {

		inserirImagem("Elasticidade_preco_demanda.jpg", width / 8, height / 3);
		initComponents();
		setTitulo("Elasticidade: Preco na demanda");
		inicializaExtras();
		
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
	private JTextArea txtProcuraInicial() {
		String textoProcuraInicial = "Insira um valor para a quantidade inicial";
		JTextArea txtArea = new JTextArea(textoProcuraInicial);
		txtArea.setEditable(false);
		txtArea.setFont(new Font("Arial", 0, 14));

		return txtArea;
	}
	
	private JTextArea txtProcuraFinal() {
		String textoProcuraInicial = "Insira um valor para a quantidade final";
		JTextArea txtArea = new JTextArea(textoProcuraInicial);
		txtArea.setEditable(false);
		txtArea.setFont(new Font("Arial", 0, 14));

		return txtArea;
	}
	
	private JTextArea txtPrecoInicial() {
		String textoProcuraInicial = "Insira um valor para o preco inicial";
		JTextArea txtArea = new JTextArea(textoProcuraInicial);
		txtArea.setEditable(false);
		txtArea.setFont(new Font("Arial", 0, 14));

		return txtArea;
	}
	
	private JTextArea txtPrecoFinal() {
		String textoProcuraInicial = "Insira um valor para o preco final";
		JTextArea txtArea = new JTextArea(textoProcuraInicial);
		txtArea.setEditable(false);
		txtArea.setFont(new Font("Arial", 0, 14));

		return txtArea;
	}
	
	
	private void inicializaExtras(){
		JTextArea procuraInicial = txtProcuraInicial();
		Dimension dProcuraInicial = procuraInicial.getPreferredSize();
		JScrollPane panelProcuraInicial = caixaDeTexto(procuraInicial, width / 8, height / 3 + 500, dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelProcuraInicial.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane()
				.add(procuraInicial);
		
		JTextArea procuraFinal = txtProcuraFinal();
		Dimension dProcuraFinal = procuraFinal.getPreferredSize();
		JScrollPane panelProcuraFinal = caixaDeTexto(procuraFinal, width / 8 + 100, height / 3 + 100, dProcuraFinal.width + 10, dProcuraFinal.height + 5);
		panelProcuraFinal.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane()
				.add(procuraFinal);
		
		JTextArea precoInicial = txtPrecoInicial();
		Dimension dPrecoInicial = precoInicial.getPreferredSize();
		JScrollPane panelPrecoInicial = caixaDeTexto(precoInicial, width / 8, height / 3 + 300, dPrecoInicial.width + 10, dPrecoInicial.height + 5);
		panelPrecoInicial.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane()
				.add(precoInicial);
		
		JTextArea precoFinal = txtPrecoFinal();
		Dimension dPrecoFinal = precoFinal.getPreferredSize();
		JScrollPane panelPrecoFinal = caixaDeTexto(precoFinal, width / 8 + 100, height / 3 + 300, dPrecoFinal.width + 10, dPrecoFinal.height + 5);
		panelPrecoFinal.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane()
				.add(precoFinal);
		
	}


	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaElasticidade = InterfaceController.controlaTelas("TelaElasticidade");
		telaElasticidade.setVisible(true);

		dispose();
	}

	/*******************************************************************************/

}
