
public class Ex_Naturais {
	
	public Ex_Naturais () {
		super();
	}

	
	public static void main (String args[]) {
		
		int N = 4;
		int cont = 0;
		int resultado = Somatoria(N, cont);
		System.out.println("A somat�ria == " +resultado);
		
	}
	
	public static int Somatoria(int N, int cont) {
		
		if(N <= 0) {  // o N como o pr�prio contador dos n�meros naturais. Ele s� vai parar a fun��o quando igualar a zero
			return 0;
		}
		
		//Sequ�ncia (0 + 1 + 2 + 3 = 6)
		
		else {  
			N = N - 1; 
			cont = cont + 1;
			return  N + Somatoria(N, cont); //Ele ir� somar aos seus antecessores
		}
		
		
	}
	
}
