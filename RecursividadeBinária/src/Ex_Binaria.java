
public class Ex_Binaria {
	
	public Ex_Binaria() {
		super();
	}


	public static void main(String[] args) {
		
		int number = 44;
		int resto = 0;
		String binario = Converter(number, resto);
		System.out.println("O valor em bin�rio == " +binario);
		
	}
	
	
	public static String Converter (int number, int resto) {
		
		if(number == 0) { //A condi��o de parada est� quando n�o h� como fazer mais divis�es no n�mero
			return "";
		}
		
		else {
			resto = (number % 2); //Verifica o resto
			number = number/2; //Divide o n�mero
			String s = String.valueOf(resto); //Converte para String
			return Converter(number, resto) + s; //E a recursiva ser� a concatena��o de cada resto 
		}
		
	}
	
	
	

}
