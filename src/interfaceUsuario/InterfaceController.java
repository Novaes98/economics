package interfaceUsuario;

import interfaceUsuario.Elasticidade.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import interfaceUsuario.Elasticidade.TelaElasticidade;
import interfaceUsuario.OfertaDemanda.TelaOfertaVsDemanda;
import interfaceUsuario.RendaNacional.TelaPib;

public class InterfaceController {

	public static JFrame controlaTelas(String telaNova) {
		JFrame novaTela = new JFrame();

		switch (telaNova) {

		case "PrecoCruzada":
			novaTela = new ElasticidadePrecoCruzada();
			break;

		case "PrecoDemanda":
			novaTela = new ElasticidadePrecoDemanda();
			break;

		case "ProcuraRendimento":
			novaTela = new ElasticidadeProcuraRendimento();
			break;

		case "TelaElasticidade":
			novaTela = new TelaElasticidade();
			break;

		case "TelaInflacao":
			novaTela = new TelaInflacao();
			break;

		case "TelaInicial":
			novaTela = new TelaInicial();
			break;

		case "TelaMacroeconomia":
			novaTela = new TelaMacroeconomia();
			break;

		case "TelaMicroeconomia":
			novaTela = new TelaMicroeconomia();
			break;

		case "TelaISLM":
			novaTela = new TelaISLM();
			break;

		case "TelaOfertaVsDemanda":
			novaTela = new TelaOfertaVsDemanda();
			break;

		
		case "TelaPIB":
			novaTela = new TelaPib();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Tela invalida");

		}
		return novaTela;
	}
}
