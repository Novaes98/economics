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
		this.textoPrincipal = " O Produto Interno Bruto � um indicador para medir a atividade econ�mica de um pa�s,\n"
	+" podendo ser calculado pela soma das riquezas produzidas dentro do pa�s (empresas\n"
				+" nacionais e estrangeiras) ou pela �tica da demanda( consumo interno, investimentos,\n"
	+" importa��es e exporta��es). O PIB nominal � calculado a pre�os correntes, isto �,\n"
				+" no ano em que o produto foi produzido e comercializado. O PIB real � calculado a\n"
	+" pre�os constantes, em que � escolhido um ano base para o c�lculo, eliminando\n" 
				+"assim o efeito da infla��o.\n O deflator do PIB � uma forma poss�vel de medir o n�vel geral\n"
	+" de pre�os, sendo obtido a partir da divis�o entre o PIB nominal e o PIB real\n"
				+" multiplicado por cem. Essa medida � utilizada para estimar a valoriza��o dos \n"
	+"produtos em um certo intervalo de tempo, fazendo do PIB seja compreendido como  \n"
				+"al�m de um simples aumento de pre�os atrav�s da infla��o.\n A partir da taxa de crescimento\n "
	+"do deflator temos a taxa de infla��o de um per�odo determinado. A taxa de infla��o \n"
				+"reflete o aumento percentual dos pre�os num determinado per�odo de tempo.";
	}
	/**********************/  /***********************************************************************************/    /*********************************************************************************/   /*********************************************************************************/      /*********************************************************************************/     /*********************************************************************************/   /*********************************************************************************/     /*********************************************************************************/      /*********************************************************************************//*********************************************************************************/       /*********************************************************************************/ 

	
	
}
