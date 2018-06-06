package br.com.empresa.banco.conta;
public abstract class Conta {
/**
 * Classe Conta para modelar o tipo da conta 
 * 
 */
	protected double saldo;
	private int numero;
	protected String nome; 
	
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
/**
 * 
 * @param d variavel de argumento
 * @throws ValorInvalidoException para tratar uma exceção
 */
	public String toString(){
		return "Esse objeto é uma conta com saldo R$ "+this.saldo;
	}
	
	@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + numero;
	return result;
}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setDeposita(double d) throws ValorInvalidoException {
		if (d <= 0) {
			throw new ValorInvalidoException(d);
		} else {
			this.saldo += d;
		}
	}

	public void setSaca(double v) {
		/*
		 * if(this.saldo > v){ System.out.println("Saldo insuficiente!"); }else{
		 */
		this.saldo -= v;
		System.out.println("Saldo anterior: " + this.saldo);
		// }
	}

	public abstract void atualiza(double taxa);
}
