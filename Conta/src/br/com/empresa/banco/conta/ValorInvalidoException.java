package br.com.empresa.banco.conta;
public class ValorInvalidoException extends RuntimeException {

	public ValorInvalidoException(Double valor) {
		super("Valor invalido " + valor);
	}
/**
 * Classe para tratar exce��es do tipo Exception	
 */
}
