package interfaceUsuario.Elasticidade;

import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;

public class ElasticidadePrecoDemanda extends FrameSecundario {

	public ElasticidadePrecoDemanda() {
		inserirImagem("Elasticidade_preco_demanda.jpg", width / 8, height/3);
		initComponents();
		setTitulo("Elasticidade: Preco na demanda");
	}

	/*******************************************************************************/

	protected void definirTexto() {
		this.texto = "    A elasticidade do pre�o na procura serve para mensurar o quanto a demanda\n "
				+ "por um bem ou servi�o varia em rel��o �s mudan�as no pre�o destes, supondo \n"
				+ "que todas as outras vari�veis envolvidas permane�am constantes.\n"
				+ "    As elasticidades do pre�o s�o quase sempre negativas, ou seja, quanto\n"
				+ "maior o pre�o do bem ou servi�o, menor a procura.";

	}

	/*******************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaElasticidade = InterfaceController.controlaTelas("TelaElasticidade");
		telaElasticidade.setVisible(true);

		dispose();
	}

	/*******************************************************************************/
	

	


}
