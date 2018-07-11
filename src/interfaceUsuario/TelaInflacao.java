package interfaceUsuario;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TelaInflacao extends FrameSecundario {
	JTextArea txtAreaExplicacao;

	public TelaInflacao() {

		initComponents();
		setTitulo("Inflacao");
	}

	/***************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaMacroeconomia = InterfaceController.controlaTelas("TelaMacroeconomia");
		telaMacroeconomia.setVisible(true);

		dispose();
	}

	/*******************************************************************************/

	public void definirTexto() {
		this.textoPrincipal = " O Produto Interno Bruto é um indicador para medir a atividade econômica de um país,\n"
	+" podendo ser calculado pela soma das riquezas produzidas dentro do país (empresas\n"
				+" nacionais e estrangeiras) ou pela ótica da demanda( consumo interno, investimentos,\n"
	+" importações e exportações). O PIB nominal é calculado a preços correntes, isto é,\n"
				+" no ano em que o produto foi produzido e comercializado. O PIB real é calculado a\n"
	+" preços constantes, em que é escolhido um ano base para o cálculo, eliminando\n" 
				+"assim o efeito da inflação.\n O deflator do PIB é uma forma possível de medir o nível geral\n"
	+" de preços, sendo obtido a partir da divisão entre o PIB nominal e o PIB real\n"
				+" multiplicado por cem. Essa medida é utilizada para estimar a valorização dos \n"
	+"produtos em um certo intervalo de tempo, fazendo do PIB seja compreendido como  \n"
				+"além de um simples aumento de preços através da inflação.\n A partir da taxa de crescimento\n "
	+"do deflator temos a taxa de inflação de um período determinado. A taxa de inflação \n"
				+"reflete o aumento percentual dos preços num determinado período de tempo.";
	}
	/**********************/  /***********************************************************************************/    /*********************************************************************************/   /*********************************************************************************/      /*********************************************************************************/     /*********************************************************************************/   /*********************************************************************************/     /*********************************************************************************/      /*********************************************************************************//*********************************************************************************/       /*********************************************************************************/ 

	
	
}
