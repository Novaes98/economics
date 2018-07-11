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
		this.texto = "    A elasticidade do preço na procura serve para mensurar o quanto a demanda\n "
				+ "por um bem ou serviço varia em relção às mudanças no preço destes, supondo \n"
				+ "que todas as outras variáveis envolvidas permaneçam constantes.\n"
				+ "    As elasticidades do preço são quase sempre negativas, ou seja, quanto\n"
				+ "maior o preço do bem ou serviço, menor a procura.";

	}

	/*******************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaElasticidade = InterfaceController.controlaTelas("TelaElasticidade");
		telaElasticidade.setVisible(true);

		dispose();
	}

	/*******************************************************************************/
	

	


}
