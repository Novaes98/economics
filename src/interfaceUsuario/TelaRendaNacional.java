package interfaceUsuario;

import javax.swing.JFrame;

public class TelaRendaNacional extends FramePrincipal {
	
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

}
