package interfaceUsuario;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TelaInflacao extends FrameSecundario {
	JTextArea txtAreaExplicacao;

	public TelaInflacao() {

		initComponents();
		setTitulo("Inflacao");
	}

	/***************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaMacroeconomia = InterfaceController.controlaTelas("TelaMacroeconomia");
		telaMacroeconomia.setVisible(true);

		dispose();
	}
	/*******************************************************************************/
	
	
	public void definirTexto(){
		this.texto = "Eh aqui que colocaremos o texto bonito sobre inflacao.";
	}
}
