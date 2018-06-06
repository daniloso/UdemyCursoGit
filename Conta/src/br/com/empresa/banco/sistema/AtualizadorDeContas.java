package br.com.empresa.banco.sistema;
import br.com.empresa.banco.conta.Conta;

public class AtualizadorDeContas {

	protected double saldoTotal = 0;
	private double selic;
/**
 * 
 * @param selic atualiza 
 */
	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		c.setSaca(selic);
		System.out.printf("\nSaldo atual: %.2f ", c.getSaldo());
		c.atualiza(this.selic);
		System.out.printf("\nSaldo final: %.2f ", c.getSaldo());
		this.saldoTotal += c.getSaldo();

	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}
		
}
