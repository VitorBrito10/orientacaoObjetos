package entidades;

public class Retangulo {

	public double altura;
	public double largura;

	public double area(double altura, double largura) {

		double area = altura * largura;
		return area;

	}

	public double perimetro(double altura, double largura) {

		double perimetro = (2 * altura) + (2 * largura);
		return perimetro;

	}

	public double diagonal(double altura, double largura) {

		double perimetro =  Math.sqrt(altura * altura + largura * largura);
		
		return perimetro;

	}

}
