
public class Ex_Validacao {
	
	
	public Ex_Validacao() {
		super();
	}

	public static void main(String[] args) {
		
		
		int primeiro = 122145;
		int segundo = 2;
		
		int quant = Validacao(primeiro, segundo);
		System.out.println("Quantidade de vezes: " +quant);
		
		

	}
	
	public static int Validacao(int primeiro, int segundo) {
		
		if(primeiro == 0) { //A condi��o de parada ser� quando o valor for igual a zero, n�o for poss�vel mais fazer divis�es
			return 0;
		}
		
		else {
			if (primeiro % 10 == segundo) {
				 return 1 + Validacao(primeiro / 10, segundo); //Condi��o da recursiva somar� caso o resto seja igual ao d�gito
			}
			
			else {
				return 0 + Validacao(primeiro / 10, segundo);
			}
			
			
			
		}
		
		
		
		
	}

}
