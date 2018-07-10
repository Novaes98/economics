package interfaceUsuario.Elasticidade;

import javax.swing.JFrame;

import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;

public class ElasticidadePrecoOferta extends FrameSecundario {

	public ElasticidadePrecoOferta() {
		initComponents();
		setTitulo("Elasticidade: preco-oferta");
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
