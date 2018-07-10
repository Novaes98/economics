package interfaceUsuario.Elasticidade;

import javax.swing.JFrame;

import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;

public class ElasticidadePrecoCruzada extends FrameSecundario {

	public ElasticidadePrecoCruzada() {
		initComponents();
		setTitulo("Elasticidade cruzada");
	}

	/*******************************************************************************/

	protected void definirTexto() {

	}

	/*******************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaElasticidade = InterfaceController.controlaTelas("TelaElasticidade");
		telaElasticidade.setVisible(true);

		dispose();
	}

	/*******************************************************************************/
}
