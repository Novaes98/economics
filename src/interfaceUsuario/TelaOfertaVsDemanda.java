package interfaceUsuario;

import javax.swing.JFrame;

public class TelaOfertaVsDemanda extends FrameSecundario {

	public TelaOfertaVsDemanda() {
		initComponents();
		setTitulo("Curva de oferta e demanda");
	}
	
	/***************************************************************************/


	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaMicroeconomia = InterfaceController.controlaTelas("TelaMicroeconomia");
		telaMicroeconomia.setVisible(true);

		dispose();
	}
	/*******************************************************************************/
	
	public void definirTexto(){
		this.textoPrincipal = "Era uma vez um porquinho legal.";
	}
}
