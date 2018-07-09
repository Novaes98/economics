package interfaceUsuario;

import javax.swing.JFrame;

public class TelaElasticidade extends FrameSecundario {
	
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
	
	public void definirTexto(){
		this.texto = "Era uma vez um porquinho legal.";
	}
	
}
