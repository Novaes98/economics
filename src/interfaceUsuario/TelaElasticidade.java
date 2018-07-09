package interfaceUsuario;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaElasticidade extends FrameSecundario {
	private JButton botaoPrecoDemanda;
	private JButton botaoProcuraRendimento;
	private JButton botaoPrecoCruzada;
	private JButton botaoPrecoOferta;

	
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
		this.texto = 
				"A elasticidade pode ser definida como o tamanho do impacto que a alteracao" 
				+ "em uma variavel exerce sobre uma outra variavel [https://pt.wikipedia.org/wiki/Elasticidade_(economia)].\n"
				+ "Em microeconomia, existem tres tipos de elasticidade: \n\n"
				+ "\t- Elasticidade preco da demanda;\n"
				+ "\t- Elasticidade procura rendimento;\n"
				+ "\t- Elasticidade-preco cruzada da demanda.\n"
				+ "\t- Elasticidade-preco da oferta.\n\n"
				+ "Clique em um dos botoes abaixo para saber mais sobre cada uma delas.";
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
		botaoPrecoDemanda.setText("Preco da demanda");

		botaoProcuraRendimento = new JButton();
		botaoProcuraRendimento.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				procuraRendimento(e);
			}
		});
		botaoProcuraRendimento.setText("Procura rendimento");

		botaoPrecoCruzada = new JButton();
		botaoPrecoCruzada.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				precoCruzada(e);
			}
		});
		botaoPrecoCruzada.setText("Preco cruzada da demanda");
		
		botaoPrecoOferta = new JButton();
		botaoPrecoOferta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				precoOferta(e);
			}
		});
		botaoPrecoOferta.setText("Preco da oferta");

		LinkedList<JButton> botoes = new LinkedList<>();
		botoes.add(botaoPrecoDemanda);
		botoes.add(botaoProcuraRendimento);
		botoes.add(botaoPrecoCruzada);
		botoes.add(botaoPrecoOferta);

		insereBotoes(botoes);
	}
	
	/*******************************************************************************/
	
	public void precoDemanda(ActionEvent e){
		
	}
	/*******************************************************************************/
	
	public void procuraRendimento(ActionEvent e){
		
	}
	/*******************************************************************************/
	
	public void precoCruzada(ActionEvent e){
		
	}
	/*******************************************************************************/
	
	public void precoOferta(ActionEvent e){
		
	}
	/*******************************************************************************/

	/***************************************************************************/

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
		int deslocamentoTopoy = height/6;

		// Coloca os malditos dos botoes nas telas
		for (JButton btn : buttons) {
			deslocamentoTopoy = deslocamentoTopoy + deslocy;
			btn.setBounds(deslocx, deslocamentoTopoy, d.width, d.height);
			getContentPane().add(btn);
		}
	}

	/***************************************************************************/

}
