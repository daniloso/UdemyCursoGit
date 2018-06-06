package br.com.empresa.banco.conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

	private List<Conta> contas = new ArrayList<>();;
	private Map<String, Conta> indexadoPorNome = new HashMap<>();
	
	public void adiciona(Conta c) {
		contas.add(c);
		indexadoPorNome.put(c.getNome(), c);
	}

	public Conta pega(int x) {
		return contas.get(x);

	}

	public int pegaQuantidadeDeContas() {
		return contas.size();

	}
	
	public Conta buscaPorNome (String nome){
		return indexadoPorNome.get(nome);
	}
}
