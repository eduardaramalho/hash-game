
public class JogoClass {

	private JVEnum [][] table = {
			{JVEnum.EMPTY, JVEnum.EMPTY, JVEnum.EMPTY },
			{JVEnum.EMPTY, JVEnum.EMPTY, JVEnum.EMPTY },
			{JVEnum.EMPTY, JVEnum.EMPTY, JVEnum.EMPTY }
		};
	
	private JVEnum jogadorAtual = JVEnum.X; 
			
	private void trocarJogador() {
		if(this.jogadorAtual == JVEnum.X) {
			this.jogadorAtual = JVEnum.O;
		} else {
			this.jogadorAtual = JVEnum.X;
		}
	}
	
	private void imprimir() {
		System.out.println("_"+ this.table[0][0].toString("|") + "_" + this.table[0][1].toString("|") + "_" + this.table[0][0]);
		System.out.println("_"+ this.table[1][0].toString("|") + "_" + this.table[1][1].toString("|") + "_" + this.table[0][0]);
		System.out.println(" "+ this.table[2][0].toString("|") + " " + this.table[2][1].toString("|") + " " + this.table[0][0]);
	}
	
	public void jogar() {
		this.imprimir();
		new LerTeclado().ler(jogadorAtual);
	}
}
