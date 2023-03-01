
public class Ex_Saida {
	
	public Ex_Saida() {
		super();
	}

	public static void main(String[] args) {
		
		int N = 3;
		double x = 0;
		double resultado = Somatoria(N, x);
		
		System.out.println("RESULTADO == " +resultado);
		
		
		
		
	}
	
	public static double Somatoria(int N, double x) {
		
		
		if(x == N) { //A condição de parada é quando o denominador se igualar ao número fornecido (N)
			return 0;
		}
		
		else {
			x = x + 1; //Começa a somatória com 1
			double r = 1/((double)x);
			return r + Somatoria(N, x); //A recursiva é a somatória de todas as divisões
		}
		
		
	}

}
