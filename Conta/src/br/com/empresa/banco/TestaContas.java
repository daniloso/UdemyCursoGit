package br.com.empresa.banco;
import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.conta.ValorInvalidoException;
import br.com.empresa.banco.sistema.AtualizadorDeContas;

public class TestaContas {
	public static void main(String[] args) {
		//Conta[] conta = new Conta[10];
		Conta c = new ContaCorrente(0, null);
		Conta cc = new ContaCorrente(0, null);
		Conta cp = new ContaPoupanca(0, null);
		AtualizadorDeContas at = new AtualizadorDeContas(0.01);
		
		try {
			c.setDeposita(-10);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			cc.setDeposita(1000);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			cp.setDeposita(1000);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.printf("Saldo da conta: %.2f ", c.getSaldo());
		System.out.printf("\nSaldo da conta corrente: %.2f " , cc.getSaldo());
		System.out.printf("\nSaldo da conta poupança: %.2f " , cp.getSaldo());

		at.roda(c);
		at.roda(cc);
		at.roda(cp);
		System.out.printf("\nSaldo total: %.2f " , at.getSaldoTotal());

	}
}
