package interfaceUsuario;

public class Validador {
	public static void validaCampoDinheiro(String texto, String nomeDoCampo) throws ValidacaoException {
		try{
			double teste = Double.parseDouble(texto);
			
			if(teste < 0) throw new ValidacaoException("O valor digitado em " + nomeDoCampo + " nao pode ser negativo.");
			if(!texto.matches("^[0-9]{1,10}\\.[0-9]{2}") && !texto.matches("^[0-9]{1,10}")) throw new ValidacaoException("O valor digitado em " + nomeDoCampo + " precisa estar no formato ####.##.");
			

		}catch(NumberFormatException e){
			throw new ValidacaoException("O valor digitado em " + nomeDoCampo + " nao eh um numero real.");
		}
		
	}
	public static void validaCampoInteiro(String texto, String nomeDoCampo) throws ValidacaoException {
		try{
			int teste = Integer.parseInt(texto);
			if(teste < 0) throw new ValidacaoException("O valor digitado em " + nomeDoCampo + " nao pode ser negativo.");

		}catch(NumberFormatException e){
			throw new ValidacaoException("O valor digitado em " + nomeDoCampo + " nao eh um numero inteiro.");

		}
	}
}
