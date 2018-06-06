package br.com.empresa.banco.sistema;

import br.com.empresa.banco.Tributavel;


public class GerenciadorDeImpostoDeRenda {
	
	private double total;
	
	public void adiciona(Tributavel t){
		System.out.println("Adicionando tributavel: "+t);
		this.total = this.total + t.calculaTributos();
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
			
}
