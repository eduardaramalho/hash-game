import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LerTeclado {
	
	private String LerTeclado() {
		try {
			BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
			return in.readLine();
		} catch (Exception e) {
			System.out.println("Error on read keyboard: " + e.getMessage());
			return " ";
		}
	}
	
	private Pos validar(String text) {                
		if(text == null || text.length()!=2 || !Character.isDigit(text.charAt(0))) {
			return null;
		}
		
		text = text.toUpperCase();
		char linhaChar = text.charAt(0);
		char colunaChar = text.charAt(1);
		int linhaInt = Integer.parseInt(Character.toString(linhaChar));
				
		if( linhaInt<1 || linhaInt>3) {
			return null; 
		}
		
		if(colunaChar != 'A' && colunaChar != 'B' && colunaChar != 'C' ) {
			return null;
		}
		
		if(colunaChar == 'A') {
			return new Pos (linhaInt, 0);
		}
		
		if(colunaChar == 'B') {
			return new Pos (linhaInt, 1);
		}
		
		return new Pos (linhaInt, 2);
		
	}
	
	public Pos ler(JVEnum jogador) {
		System.out.println("Jogador " + jogador.toString() + " jogue!");
		String text = LerTeclado();
		
		Pos result = validar(text);
		
		if(result != null) {
			return result;
		}
		
		System.out.println("Jogada inválida, digite novamente:");
		return ler(jogador);
	}
	
}
