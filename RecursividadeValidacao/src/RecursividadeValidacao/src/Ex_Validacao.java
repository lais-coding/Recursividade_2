
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
		
		if(primeiro == 0) { //A condição de parada será quando o valor for igual a zero, não for possível mais fazer divisões
			return 0;
		}
		
		else {
			if (primeiro % 10 == segundo) {
				 return 1 + Validacao(primeiro / 10, segundo); //Condição da recursiva somará caso o resto seja igual ao dígito
			}
			
			else {
				return 0 + Validacao(primeiro / 10, segundo);
			}
			
			
			
		}
		
		
		
		
	}

}
