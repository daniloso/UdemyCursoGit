package br.com.empresa.banco.conta;
import br.com.empresa.banco.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int num, String name) {
		this.nome = name;
		setNumero(num);
	}

	public void deposita(double deposito){
		this.saldo+=deposito;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public double calculaTributos() {

		return this.getSaldo() * 0.01;
	}
}
