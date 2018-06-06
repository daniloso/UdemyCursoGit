package br.com.empresa.banco;
import java.io.PrintStream;
import br.com.empresa.banco.conta.*;

public class TestaInteger {
	
	public static void main(String[] args) {
		
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		String valida = "100";
		String invalida = "invalida";
		Conta conta = new ContaCorrente();
		System.out.println(conta);
		
		PrintStream saida = System.out;
		saida.println("ola");
		
		//testando parseInt. String valida sendo transformada em int e depois somando com um numro 
		int i1 = Integer.parseInt(valida);
		i1+=1;
		System.out.println(i1);
		
		//testando parseInt. String invalida 
		int i2 = Integer.parseInt(invalida);
		System.out.println(i2);
		
		
		if (x1 == x2){
			System.out.println("Igual");
		}else{
			System.out.println("Diferente");
		}
		
		if (x1.equals(x2)){
			System.out.println("Igual com método equals");
		}else
			System.out.println("Diferente com equals");
	}
	
}
