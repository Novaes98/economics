package interfaceUsuario;

import javax.swing.JFrame;

public class TelaISLM extends FrameSecundario {

	public TelaISLM() {
		initComponents();
		setTitulo("Modelo de IS-LM");
	}

	/***************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaMacroeconomia = InterfaceController.controlaTelas("TelaMacroeconomia");
		telaMacroeconomia.setVisible(true);

		dispose();
	}

	/*******************************************************************************/

	public void definirTexto() {
		this.textoPrincipal = "Era uma vez um porquinho legal.";
	}
	/*******************************************************************************/

}
