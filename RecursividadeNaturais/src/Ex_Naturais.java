
public class Ex_Naturais {
	
	public Ex_Naturais () {
		super();
	}

	
	public static void main (String args[]) {
		
		int N = 4;
		int cont = 0;
		int resultado = Somatoria(N, cont);
		System.out.println("A somatória == " +resultado);
		
	}
	
	public static int Somatoria(int N, int cont) {
		
		if(N <= 0) {  // o N como o próprio contador dos números naturais. Ele só vai parar a função quando igualar a zero
			return 0;
		}
		
		//Sequência (0 + 1 + 2 + 3 = 6)
		
		else {  
			N = N - 1; 
			cont = cont + 1;
			return  N + Somatoria(N, cont); //Ele irá somar aos seus antecessores
		}
		
		
	}
	
}
