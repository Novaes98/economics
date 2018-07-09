package interfaceUsuario;

import javax.swing.JFrame;

public class TelaElasticidade extends FramePrincipal {
	
	public TelaElasticidade(){
		initComponents();
		setTitulo("Elasticidade");
	}
	
	/***************************************************************************/


	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaMicroeconomia = InterfaceController.controlaTelas("TelaMicroeconomia");
		telaMicroeconomia.setVisible(true);

		dispose();
	}
	/*******************************************************************************/
	
}
