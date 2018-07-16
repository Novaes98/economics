
package interfaceUsuario.Elasticidade;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;

import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;

public class TelaElasticidade extends FrameSecundario {
	private JButton botaoPrecoDemanda;
	private JButton botaoProcuraRendimento;
	private JButton botaoPrecoCruzada;

	public TelaElasticidade() {
		initComponents();
		setTitulo("Elasticidade");
		initButtons();
	}

	/***************************************************************************/

	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaMicroeconomia = InterfaceController.controlaTelas("TelaMicroeconomia");
		telaMicroeconomia.setVisible(true);
		dispose();
	}

	/*******************************************************************************/

	public void definirTexto() {
		this.textoPrincipal = "    A elasticidade pode ser definida como o tamanho do impacto que a alteração em\n"
				+ "uma variável exerce sobre uma outra variável \n\n"
				+ "    Em microeconomia, existem diversos tipos de elasticidade, tais como: \n\n"
				+ "\t- Preco da demanda;\n"
				+ "\t- Renda da demanda;\n"
				+ "\t- Preco da demanda cruzada.\n"
				+ "    Clique em um dos botões abaixo para saber mais sobre cada uma delas.";
	}

	/*******************************************************************************/

	protected void initButtons() {
		botaoPrecoDemanda = new JButton();
		botaoPrecoDemanda.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				precoDemanda(e);
			}
		});
		botaoPrecoDemanda.setText("Preço da demanda");

		botaoProcuraRendimento = new JButton();
		botaoProcuraRendimento.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				procuraRendimento(e);
			}
		});
		botaoProcuraRendimento.setText("Renda da demanda");

		botaoPrecoCruzada = new JButton();
		botaoPrecoCruzada.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				precoCruzada(e);
			}
		});
		botaoPrecoCruzada.setText("Preço da demanda cruzada");

	

		LinkedList<JButton> botoes = new LinkedList<>();
		botoes.add(botaoPrecoDemanda);
		botoes.add(botaoProcuraRendimento);
		botoes.add(botaoPrecoCruzada);

		insereBotoes(botoes);
	}

	/*******************************************************************************/

	public void precoDemanda(ActionEvent e) {
		JFrame precoDemanda = InterfaceController.controlaTelas("PrecoDemanda");
		precoDemanda.setVisible(true);
		dispose();
	}

	/*******************************************************************************/

	public void procuraRendimento(ActionEvent e) {
		JFrame procuraRendimento = InterfaceController.controlaTelas("ProcuraRendimento");
		procuraRendimento.setVisible(true);
		dispose();
	}

	/*******************************************************************************/

	public void precoCruzada(ActionEvent e) {
		JFrame precoCruzada = InterfaceController.controlaTelas("PrecoCruzada");
		precoCruzada.setVisible(true);
		dispose();
	}

	/*******************************************************************************/

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
		int espacoDisponivel = (height - heightTexto);
		int deslocy = (espacoDisponivel - quantidadeBtn * deslocamentoBtn) / (quantidadeBtn + 1);
		int deslocx = (width - d.width) / 2;
		int deslocamentoTopoy = height / 6;

		// Coloca os malditos dos botoes nas telas
		for (JButton btn : buttons) {
			deslocamentoTopoy = deslocamentoTopoy + deslocy;
			btn.setBounds(deslocx, deslocamentoTopoy, d.width, d.height);
			getContentPane().add(btn);
		}
	}

	/***************************************************************************/

}
