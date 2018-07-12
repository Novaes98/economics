package interfaceUsuario.RendaNacional;

import javax.swing.JFrame;

import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;

public class TelaPib extends FrameSecundario {
	
	public TelaPib() {
		initComponents();
		setTitulo("Produto Interno Bruto (PIB)");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void definirTexto() {
		this.textoPrincipal = "Definir PIB, PNB, PNL, Renda per capta\n"
				+ "Y = C + I + G + X-M, PIB REAL x NOMINAL e seus calculos";
		
	}
	
	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaElasticidade = InterfaceController.controlaTelas("TelaRendaNacional");
		telaElasticidade.setVisible(true);

		dispose();
	}

}
