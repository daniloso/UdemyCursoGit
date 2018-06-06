
class Teste {
	
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3, 2);
		AreaCalculavel b = new Quadrado(2);
		AreaCalculavel c = new Circulo(2);
		System.out.println(a.calculaArea());
		System.out.println(b.calculaArea());
		System.out.println(c.calculaArea());
	}

}
