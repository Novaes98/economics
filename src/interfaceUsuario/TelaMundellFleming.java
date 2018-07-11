package interfaceUsuario;

import javax.swing.JFrame;

public class TelaMundellFleming extends FrameSecundario {
	
	public TelaMundellFleming(){
		initComponents();
		setTitulo("Modelo de Mundell-Fleming");
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
