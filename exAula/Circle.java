package exAula;

public class Circle {
	//atributos
	private Double raio;
	private static final Double PI = 3.14;
	
	//metodo construtor
	public Circle(Double raio) {
		this.raio = raio;
	}
	
	//metodo calcular a area
	public Double calcularArea() {
		return PI * Math.pow(raio,2);
	}
	
	//metodo calcular o perimetro
	public Double calcularPerimetro() {
		return 2 * PI * Math.pow(raio,2);
	}
	//metodo para pegar o valor do raio
	public Double getRaio() {
		return raio;
	}
	//metodo para alterar o valor do raio
	public void setRaio(Double raio) {
		this.raio = raio;
	}

	//metodo para mostrat na tela
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Area: ");
		sb.append(calcularArea() + "\n");
		sb.append("Perímetro: ");
		sb.append(calcularPerimetro());
		return sb.toString();
	}
}
