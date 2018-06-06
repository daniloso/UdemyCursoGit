package br.com.empresa.banco;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {

		Random rnd = new Random();
		ContaPoupanca c1 = new ContaPoupanca(rnd.nextInt(2000), "Danilo");
		c1.setDeposita(rnd.nextInt(10000)+rnd.nextDouble());
		ContaPoupanca c2 = new ContaPoupanca(rnd.nextInt(2000),"Carol");
		c2.setDeposita(rnd.nextInt(10000)+rnd.nextDouble());
		ContaPoupanca c3 = new ContaPoupanca(rnd.nextInt(2000), "Davi");
		c3.setDeposita(rnd.nextInt(10000)+rnd.nextDouble());
		
			
		
		List <ContaPoupanca> contas = new LinkedList<>();
		contas.add(c1);
		contas.add(c3);
		contas.add(c2);
		
		
		  for (ContaPoupanca conta : contas) {
              System.out.println(conta);
          }
		  
		  System.out.println(contas);
		  		  
		  Collections.sort(contas);
	}

}
