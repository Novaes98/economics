package interfaceUsuario;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.util.LinkedList;

public class FramePrincipal extends JFrame {

	protected int quantidadeBtn = 0;
	protected JLabel titulo;
	protected JLabel periodo;
	protected int height = 600;
	protected int width = 500;
	protected JMenuBar menuBar;
	protected JMenu voltar;

	/**
	 * ****************************************************************************
	 */

	protected void insereBotoes(LinkedList<JButton> buttons) {
		quantidadeBtn = buttons.size();

		// Descobre os deslocamentos necessarios para centralizar as coisas
		Dimension d = buttons.get(0).getPreferredSize();
		for (int y = 0; y < buttons.size(); y++) {
			Dimension dd = buttons.get(y).getPreferredSize();
			if (dd.width > d.width) {
				d = dd;
			}
		}
		int deslocamentoBtn = d.height;
		int espacoDisponivel = height * 9 / 10;
		int deslocy = (espacoDisponivel - quantidadeBtn * deslocamentoBtn) / (quantidadeBtn + 1);
		int deslocx = (width - d.width) / 2;
		int deslocamentoTopoy = height * 1 / 10;

		// Coloca os malditos dos botoes nas telas
		for (JButton btn : buttons) {
			deslocamentoTopoy = deslocamentoTopoy + deslocy;
			btn.setBounds(deslocx, deslocamentoTopoy, d.width, d.height);
			deslocamentoTopoy = deslocamentoTopoy + deslocamentoBtn;
			getContentPane().add(btn);
		}
	}

	/**
	 * ****************************************************************************
	 */

	protected void initComponents() {
	
		titulo = new JLabel();
		titulo.setFont(new Font("Baskerville Old Face", 0, 20));
		getContentPane().add(titulo);

		// Menu de voltar
		menuBar = new JMenuBar();
		voltar = new JMenu();
		voltar.setText("Voltar");
		menuBar.add(voltar);

		voltar.addMenuListener(new MenuListener() {
			@Override
			public void menuSelected(MenuEvent e) {
				voltar(e);
			}

			@Override
			public void menuDeselected(MenuEvent e) {

			}

			@Override
			public void menuCanceled(MenuEvent e) {

			}
		});

		setJMenuBar(menuBar);

		setLayout(null);
		setBounds(0, 0, width, height);
		setResizable(false);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	/**
	 * ****************************************************************************
	 */

	protected void setTitulo(String t) {
		titulo.setText(t);
		Dimension dimensaopreferida = titulo.getPreferredSize();
		int desloc = (width - dimensaopreferida.width) / 2;
		titulo.setBounds(desloc, height / 10, dimensaopreferida.width, dimensaopreferida.height);
	}

	/**
	 * ****************************************************************************
	 */

	protected void voltar(MenuEvent ev) {
		// TODO os filhos devem implementar
	}

	/**
	 * ****************************************************************************
	 */

}
