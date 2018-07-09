package interfaceUsuario;

import javax.swing.JFrame;

public class InterfaceController {
	
	public static JFrame controlaTelas(String telaNova) {
		JFrame novaTela = new JFrame();
		
		
		switch(telaNova){
		
		case "TelaCalcularInflacao":
			novaTela = new TelaCalcularInflacao();
			break;	
			
		case "TelaElasticidade":
			novaTela = new TelaElasticidade();
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
			
		case "TelaMundellFleming":
			novaTela = new TelaMundellFleming();
			break;	
			
		case "TelaOfertaVsDemanda":
			novaTela = new TelaOfertaVsDemanda();
			break;	
			
		case "TelaRendaNacional":
			novaTela = new TelaRendaNacional();
			break;	
			
		}
		return novaTela;
	}
}
