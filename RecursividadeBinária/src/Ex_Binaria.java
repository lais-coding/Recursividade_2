
public class Ex_Binaria {
	
	public Ex_Binaria() {
		super();
	}


	public static void main(String[] args) {
		
		int number = 44;
		int resto = 0;
		String binario = Converter(number, resto);
		System.out.println("O valor em binário == " +binario);
		
	}
	
	
	public static String Converter (int number, int resto) {
		
		if(number == 0) { //A condição de parada está quando não há como fazer mais divisões no número
			return "";
		}
		
		else {
			resto = (number % 2); //Verifica o resto
			number = number/2; //Divide o número
			String s = String.valueOf(resto); //Converte para String
			return Converter(number, resto) + s; //E a recursiva será a concatenação de cada resto 
		}
		
	}
	
	
	

}
