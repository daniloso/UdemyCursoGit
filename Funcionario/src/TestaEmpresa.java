
public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa emp = new Empresa(20);
		emp.setEmpregados(new Funcionario[10]);
						
		for (int i = 0; i<5; i++){
			emp.getEmpregados()[i]=new Funcionario("Danilo o bom", "agora vai");
			emp.setCnpj("111111111 "+i);
			emp.setNome("Danilo "+i);
			//emp.getEmpregados()[i].nome = " Eu mesmo "+i;
			emp.getEmpregados()[i].departamento = "Cop "+i;
			//emp.getEmpregados()[i].rg = "222222222"+i;
			emp.getEmpregados()[i].setSalario(i);
			emp.setAdciona(emp.getEmpregados()[i]);
			
		}
				

		emp.getMostraEmpregados();
		emp.getMostraTodasAsInformacoes();
		emp.contem(emp.getEmpregados()[6]);
		 
					
	}
}
