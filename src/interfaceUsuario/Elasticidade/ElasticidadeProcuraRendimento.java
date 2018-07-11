package interfaceUsuario.Elasticidade;

import javax.swing.JFrame;

import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;

public class ElasticidadeProcuraRendimento extends FrameSecundario {

	public ElasticidadeProcuraRendimento() {
		initComponents();
		setTitulo("Elasticidade: Rendimento da procura");
	}

	/*******************************************************************************/

	protected void definirTexto() {

	}

	/***************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaElasticidade = InterfaceController.controlaTelas("TelaElasticidade");
		telaElasticidade.setVisible(true);

		dispose();
	}

	/*******************************************************************************/

}
