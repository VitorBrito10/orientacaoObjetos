import java.util.Locale;
import java.util.Scanner;

import util.CalculatorEstatic;

public class MainCalculatorEstaticOO {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter radius: ");
		double radius = scan.nextDouble();
		double c = CalculatorEstatic.circumference(radius);
		double v = CalculatorEstatic.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalculatorEstatic.PI);
		scan.close();

	}

}
