
public class Recursividade6 {

	public Recursividade6() {
		super();
	}
	
	
	public static void main(String[] args) {
		
		int entrada = 4;
		int serie = 0;
		
		double resultado = Serie(entrada, serie);
		System.out.println("O resultado da série == " +resultado);

	}
	
	public static double Serie(double entrada, double serie) {
		
		
		//CONDIÇÃO DE PARADA
		//Como fiz na ordem decrescente, o programa irá subtraindo 1 da 'entrada', que é o denominador das frações
		//A recursiva irá parar quando o denominador for igual a 1
		
		if(entrada == 1) { 
			return 1;
		}
		
		
		//CHAMADA DOS PASSOS
		
		else { //Enquanto o denominador não for igual a 1
			serie = (1/(Fat(entrada))); //Faz a fração, em que o denominador é um fatorial, e para facilitar, esse valor será obtido através do Método Fat
			entrada = entrada - 1; //Subtrai 1
			return serie + Serie(entrada, serie); //O resultado é a soma de todas as frações
			
		}
		
	}
	
	public static double Fat(double entrada) {
		
		double fat=entrada; //O método fat vai começar com o valor da entrada
		
		//CONDIÇÃO DE PARADA
		
		if(entrada == 1) { //Quando esse valor  for igual a 1, retornará 1, que é o útlimo elemento do fatorial
			return 1;
		}
		
		//CHAMADA DOS PASSOS
		
		else { 
			
			return fat * Fat(fat-1); //Enquanto não chegar o último elemento, vai subtraindo os valores, até que retorne 1 e faça a multiplicação
			
		}
		
	}

}
