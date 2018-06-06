
public class Empresa {
	
	private String nome;
	private String cnpj;
	private Funcionario [] empregados;
	private int livre = 0;
		
	public Empresa (int cont){
		Funcionario [] empr = new Funcionario[cont];
	}
		
	void setAdciona(Funcionario f){
		this.getEmpregados()[this.livre] = f;
		this.livre++;
	}
		

	public void getMostraEmpregados(){
		for (int i = 0; i<this.getEmpregados().length; i++){
			Funcionario empregado = this.getEmpregados()[i];
			if(empregado==null)continue;
			System.out.println("Funcionario na posição: "+i+" "+empregado.departamento+" B"+empregado.nome+" "+empregado.getSalario()+" "+empregado.rg);
		}
			
	}


	public void getMostraTodasAsInformacoes() {
		int d, m, a;
		for (int i=0; i<getEmpregados().length;i++){
			Funcionario empregado = this.getEmpregados()[i];
			d=i*5+i;
			m=i*10-1;
			a=i+2000+2;
			Data dt = new Data(d,m,a);
			System.out.println("Posição: "+i);
			if(empregado==null)continue;
			System.out.println("\nNome: "+empregado.nome+"\nDepartamento: "+empregado.departamento+"\nRG: "+empregado.rg+"\nSalário: "+empregado.getSalario()+"\nGanho Anua: "+empregado.getCalculaGanhoAnual()+"\nEmpresa: "+this.getNome()+" "+"\nIndentificação: "+empregado.getIdentifica());
		}
		
	}
	
	boolean contem (Funcionario f){
		for(int i=0; i<getEmpregados().length; i++){
			if (f==this.getEmpregados()[i]){
				return true;
			}
		}
		return false;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Funcionario [] getEmpregados() {
		return empregados;
	}


	public void setEmpregados(Funcionario [] empregados) {
		this.empregados = empregados;
	}
	

}
