public class Circulo implements AreaCalculavel{
	private double raio;
	
	public Circulo (double i){
		this.raio=i;
	}
	
	public double calculaArea(){
		return Math.PI*this.raio*this.raio;
	}
}
