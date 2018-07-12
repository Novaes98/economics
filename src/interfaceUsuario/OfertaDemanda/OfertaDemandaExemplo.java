package interfaceUsuario.OfertaDemanda;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;

public class OfertaDemandaExemplo extends FrameSecundario {
	private String victoferta, victormanda;
	
	public OfertaDemandaExemplo(String o, String d) {
		initComponents();
		setTitulo("Tela final dos resultados escolhidos");
		this.victoferta=o;
		this.victormanda=d;
		iniciarExtra();

	}

	@Override
	protected void definirTexto() {
		// TODO Auto-generated method stub

	}

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaOfertaVsDemanda = InterfaceController.controlaTelas("TelaOfertaVsDemanda");
		telaOfertaVsDemanda.setVisible(true);

		dispose();
	}

	private void iniciarExtra() {
		JOptionPane.showMessageDialog(this, victoferta+victormanda);
		
	}
	
}
