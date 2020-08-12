import java.util.Locale;
import java.util.Scanner;

import entidades.Construtor;

public class MainEncapsulamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		

		Construtor Const = new Construtor(name, price);
		System.out.println();
		System.out.println("Product data: " + Const);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		Const.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + Const);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		Const.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + Const);

		sc.close();

	}

}
