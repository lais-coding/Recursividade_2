
public class Ex_Fibonacci {
	
	
	public Ex_Fibonacci() {
		super();
	}

	public static void main(String[] args) {
		
		int valor = 4;

		
		
		int retorno = Fibonacci(valor);
		System.out.println("Valor correspondente a série: " +retorno);
		
	
	}
	
	public static int Fibonacci(int valor) {
		
			if(valor == 1 || valor == 2) {
				return 1;
			}
		
			else {
				
				return Fibonacci(valor-1) + Fibonacci(valor-2);
			}
		
	}

}
