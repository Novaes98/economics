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


	
	
	private void inicializaExtras(){
		String textoProcuraInicial = "Insira um valor para a quantidade inicial";

		JTextArea procuraInicial = txtGenerico(textoProcuraInicial);
		Dimension dProcuraInicial = procuraInicial.getPreferredSize();
		JScrollPane panelProcuraInicial = caixaDeTexto(procuraInicial, width / 8, height / 3 + 100, dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelProcuraInicial.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane()
				.add(panelProcuraInicial);
		
		String textoProcuraFinal = "  Insira um valor para a quantidade final";

		JTextArea procuraFinal = txtGenerico(textoProcuraFinal);
		Dimension dProcuraFinal = procuraFinal.getPreferredSize();
		JScrollPane panelProcuraFinal = caixaDeTexto(procuraFinal, width / 8 + 300, height / 3 + 100, dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelProcuraFinal.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane()
				.add(panelProcuraFinal);
		
		String textoPrecoInicial = "     Insira um valor para o preco inicial";

		JTextArea precoInicial = txtGenerico(textoPrecoInicial);
		Dimension dPrecoInicial = precoInicial.getPreferredSize();
		JScrollPane panelPrecoInicial = caixaDeTexto(precoInicial, width / 8, height / 3 + 200, dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelPrecoInicial.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane()
				.add(panelPrecoInicial);
		
		String textoPrecoFinal = "     Insira um valor para o preco final";

		JTextArea precoFinal = txtGenerico(textoPrecoFinal);
		Dimension dPrecoFinal = precoFinal.getPreferredSize();
		JScrollPane panelPrecoFinal = caixaDeTexto(precoFinal, width / 8 + 300, height / 3 + 200, dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelPrecoFinal.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane()
				.add(panelPrecoFinal);
		
		String textoPrecoAtual = "     Insira um valor para o preco atual";

		JTextArea precoAtual = txtGenerico(textoPrecoAtual);
		Dimension dPrecoAtual = precoAtual.getPreferredSize();
		JScrollPane panelPrecoAtual = caixaDeTexto(precoAtual, width / 8, height / 3 + 300, dProcuraInicial.width + 10, dProcuraInicial.height + 5);
		panelPrecoAtual.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		getContentPane()
				.add(panelPrecoAtual);
	}


	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaElasticidade = InterfaceController.controlaTelas("TelaElasticidade");
		telaElasticidade.setVisible(true);

		dispose();
	}

	/*******************************************************************************/

}
