import java.math.BigDecimal;
import java.util.Iterator;

public class PontoFlutuante {

	public static void main(String[] args) {
		double d1 = 0.1;
		double d2 = 0.2;
		String string = "Socorram-me, subi no ônibus em Marrocos "
				+ "anotaram a data da maratona";
		String [] palavras = string.split(" ");
		
		
		
		
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
			//System.out.println(string.split(string, i));
		}
		System.out.println("");
		 
		for (int i = palavras.length-1; i>=0; i-- ) {
			System.out.println(palavras[i]);
		}
		System.out.println("");
		
			
		// utilizando a classe BigDecimal para funções aritimeticas
		BigDecimal big1 = new BigDecimal("0.1");
		BigDecimal big2 = new BigDecimal("0.2");

		System.out.println(d1 + d2);
		System.out.println("\n" + d1 + "\n" + d2);
		System.out.println(big1.add(big2));

	}

	private static void inverte() {
		// TODO Auto-generated method stub

	}

}
