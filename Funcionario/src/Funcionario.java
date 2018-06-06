public class Funcionario {
	public String nome;
	public String departamento;
	private double salario;
	public String rg;
	public Data dataEntrada;
	private static int identificador = 1;
	int numero;

	public Funcionario(String nome, String rg) {
		this.nome = nome;
		this.rg = rg;
		this.numero = this.identificador;
		identificador++;
	}

	public Funcionario() {
		this.numero = this.identificador;
		identificador++;
	}

	public int getIdentifica() {
		return this.numero;
	}

	public void recebeAumento(double valor) {
		this.salario += valor;
	}

	public double getCalculaGanhoAnual() {
		return this.salario * 12;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double incremento) {
		this.salario = this.salario + 1000 + incremento * 100;
		;
	}
}
