package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	
	public ContaPoupanca(int num, String name) {
		this.nome = name;
		setNumero(num);
	}

	public void atualiza(double taxa) {
		this.saldo+= this.saldo*taxa*3;
	}
	
	public void setDeposita(double d) {
		this.saldo+=d-0.10;
	}

	@Override
	public int compareTo(ContaPoupanca cp) {
		return this.nome.compareTo(cp.nome);
	}
	
}
