package br.com.empresa.banco;
import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ValorInvalidoException;


public class TestaDeposita {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		
		try {
			cc.setDeposita(-5);
			
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
			System.out.println("Erro ao tentar depositar.");
			
		}
		
	}

}
