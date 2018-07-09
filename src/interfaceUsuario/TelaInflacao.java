package interfaceUsuario;

import javax.swing.JFrame;

public class TelaInflacao extends FramePrincipal {
	
	public TelaInflacao(){
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
}
