package aplication;

import java.util.Scanner;

import entidades.Retangulo;

public class MainRetangulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a altura e a largura do retângulo: ");
		double altura = scan.nextDouble();
		double largura = scan.nextDouble();
		
		System.out.println("AREA: " + retangulo.area(altura, largura));
		System.out.println("PERIMETRO: " + retangulo.perimetro(altura, largura));
		System.out.println("DIAGONAL: " + retangulo.diagonal(altura, largura));
		scan.close();
	}

}
