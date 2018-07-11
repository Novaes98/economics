package interfaceUsuario;

import javax.swing.JFrame;

public class TelaRendaNacional extends FrameSecundario {
	
	public TelaRendaNacional(){
		initComponents();
		setTitulo("Modelo de renda nacional");
	}
	
	/***************************************************************************/
	
	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaMacroeconomia = InterfaceController.controlaTelas("TelaMacroeconomia");
		telaMacroeconomia.setVisible(true);

		dispose();
	}
	/*******************************************************************************/
	
	public void definirTexto(){
		this.textoPrincipal = "Era uma vez um porquinho legal.";
	}

}
