
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
		
		
		if(x == N) { //A condi��o de parada � quando o denominador se igualar ao n�mero fornecido (N)
			return 0;
		}
		
		else {
			x = x + 1; //Come�a a somat�ria com 1
			double r = 1/((double)x);
			return r + Somatoria(N, x); //A recursiva � a somat�ria de todas as divis�es
		}
		
		
	}

}
