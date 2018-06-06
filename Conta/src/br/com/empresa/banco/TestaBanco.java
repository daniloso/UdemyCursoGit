package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaBanco {

	public static void main(String[] args) {

		HashSet<Conta> contas = new HashSet<>();
		ContaCorrente c1 = new ContaCorrente(123, "Mauricio");
		ContaCorrente c2 = new ContaCorrente(123, "Adriano");
		ContaCorrente c3 = new ContaCorrente(444, "Luiz");
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);

		System.out.println("Total de contas no hashset " + contas.size());

		// TreeSet de generics integer
		TreeSet<Integer> ordenar = new TreeSet<>();

		// criando 10000 elementos e inserindo cada um no TreeSet, a forma de
		// mostrar sera em seguida através do foreach
		for (int i = 1; i < 10000; i++) {
			ordenar.add(i);
		}

		// aqui mostra o foreach e le-se para cada Integer encontrado em
		// armazenar em ordem decrescente
		for (Integer i : ordenar.descendingSet()) {
			System.out.println(i + " ");
		}

		List<Integer> conjunto = new ArrayList();

		for (int i = 1; i < 10000; i++) {
			conjunto.add(i);
		}

		Collections.reverse(conjunto);
		for (Integer i : conjunto) {
			System.out.println(i + " ");
		}
	}

}
