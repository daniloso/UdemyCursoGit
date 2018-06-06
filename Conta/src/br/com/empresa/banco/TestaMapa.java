package br.com.empresa.banco;

import java.util.HashMap;
import java.util.Map;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaMapa {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(0, null);
		c1.setDeposita(10000);
		Conta c2 = new ContaCorrente(0, null);
		c2.setDeposita(3000);
				
		//Cria o mapa
		Map<String, Conta> mapaDeContas = new HashMap<>();
				
		//Adiciona duas chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		mapaDeContas.put("diretor", c1);
				
		Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}
}
