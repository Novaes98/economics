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
		this.textoPrincipal = " O deflator do PIB � uma forma poss咩el de medir o n咩el geral\n"
	+" de pre輟s, sendo obtido a partir da divis縊 entre o PIB nominal e o PIB real\n"
				+" multiplicado por cem. Essa medida � utilizada para estimar a valoriza鈬o dos \n"
	+"produtos em um certo intervalo de tempo, fazendo do PIB seja compreendido como  \n"
				+"al駑 de um simples aumento de pre輟s atrav駸 da infla鈬o.\n A partir da taxa de crescimento\n "
	+"do deflator temos a taxa de infla鈬o de um per卲do determinado. A taxa de infla鈬o \n"
				+"reflete o aumento percentual dos pre輟s num determinado per卲do de tempo.";
	}
	/**********************/  /***********************************************************************************/    /*********************************************************************************/   /*********************************************************************************/      /*********************************************************************************/     /*********************************************************************************/   /*********************************************************************************/     /*********************************************************************************/      /*********************************************************************************//*********************************************************************************/       /*********************************************************************************/ 

	
	
}
