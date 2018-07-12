package interfaceUsuario.RendaNacional;

import javax.swing.JFrame;

import interfaceUsuario.FrameSecundario;
import interfaceUsuario.InterfaceController;

public class TelaPib extends FrameSecundario {
	
	public TelaPib() {
		initComponents();
		setTitulo("Calculo do Produto Interno Bruto (PIB)");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void definirTexto() {
		this.textoPrincipal = "O Produto Interno Bruto (PIB) eh um indicador para medir a atividade economica de\n" 
				+ "um pais, podendo ser calculado pela soma de suas riquezas produzidas (empresas\n"
				+ "nacionais e estrangeiras) ou pela ótiica da demanda, ou seja: quem compra\n"
				+ "essas riquezas (consumo interno, do governo, investimentos e as importacoes\n"
				+ "e exportacoes).\n\nO PIB nominal eh calculado a precos correntes, isto eh, no ano em que o produto\n"
				+ "foi produzido e comercializado.\n"
				+  "O PIB real eh calculado a precos constantes, sendo escolhido um ano base para\n"
				+ "o calculo e assim eliminando o efeito da inflacao.";
		
	}
	
	protected void voltar(javax.swing.event.MenuEvent evt) {

		JFrame telaElasticidade = InterfaceController.controlaTelas("TelaMacroeconomia");
		telaElasticidade.setVisible(true);

		dispose();
	}

}
