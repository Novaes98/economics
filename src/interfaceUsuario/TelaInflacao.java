package interfaceUsuario;

import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class TelaInflacao extends FramePrincipal {
	JTextArea txtAreaExplicacao;

	public TelaInflacao() {

		height = 1200;
		width = 1000;
		initComponents();
		inicializaCaixaDeTexto();
		setTitulo("Inflacao");
	}

	/***************************************************************************/

	protected void inicializaCaixaDeTexto() {
		
			
		
			String texto = "aaaaaaaa";
			txtAreaExplicacao = new JTextArea(texto);
			txtAreaExplicacao.setEditable(false);
			JScrollPane scrollPane = new JScrollPane(txtAreaExplicacao);
			Dimension d = txtAreaExplicacao.getPreferredSize();
			
			scrollPane.setBounds(width / 4, height / 4, width/2, height/8);
			scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			getContentPane().add(scrollPane);

	}

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaMacroeconomia = InterfaceController.controlaTelas("TelaMacroeconomia");
		telaMacroeconomia.setVisible(true);

		dispose();
	}
	/*******************************************************************************/
}
