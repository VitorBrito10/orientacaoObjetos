import java.util.Locale;
import java.util.Scanner;

import util.Conversao;

public class MainConversaoDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Qual a cotação do dólar? ");
		double cotacao = scan.nextDouble();
		System.out.println("Qual o valor a ser comprado?");
		double valor = scan.nextDouble();

		double result = Conversao.dollarToReal(cotacao, valor);
		System.out.printf("Valor a ser pago em reais: R$%.2f", result);
		scan.close();

	}

}
