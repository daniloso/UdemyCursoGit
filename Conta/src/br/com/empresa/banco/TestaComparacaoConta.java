package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;

public class TestaComparacaoConta {

	public static void main(String[] args) {

		ContaCorrente c1 = new ContaCorrente();
		c1.deposita(100);
		c1.setNome("Danilo o Bom!");

		ContaCorrente c2 = new ContaCorrente();
		c2.deposita(50);
		c2.setNome("Danilo o Bom");
		
		if (c1.equals(c2)){
			System.out.println("Os valos atribuidos as variaveis são Iguais");
		}else{
			System.out.println("Não são iguais!");
		}
		if (c1==c2){
			System.out.println("Utilizando o ==, as referencias são iguais!");
		}else{
			System.out.println("Utilizando o == as referencias são diferentes.");
		}

	}

}
