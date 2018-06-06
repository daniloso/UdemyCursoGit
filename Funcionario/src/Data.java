public class Data {

	private int dia;
	private int mes;
	private int ano;
	private int ultimoDiaDoMes;

		
	public Data(int d, int m, int a){
		this.dia=d;
		this.mes=m;
		this.ano=a;
		
		if (! isDataViavel(dia, mes, ano)){
			System.out.println("A data "+getMostrarData()+" não existe!");
		}
	}
	
	 private boolean isDataViavel(int dia, int mes, int ano) {
		if (dia <=0 || mes<=0){
			return false;
		}
		
		int ultimoDiaDoMes = 31;
		if (mes==4 || mes==6 || mes==9 || mes==11){
			ultimoDiaDoMes=30;
		}else if (ano%4==0){
			ultimoDiaDoMes=29;
		}else{
			ultimoDiaDoMes=28;
		}
	 
	 if (dia > ultimoDiaDoMes){
		 return false;
	 }
	 return true;
	 }
	public String getMostrarData(){
		return this.dia+"/"+this.mes+"/"+this.ano;
	 }
		
}
