package entidades;

import java.util.Locale;
import java.util.Scanner;

public class mainFuncionario {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		Funcionario func = new Funcionario();
		
		System.out.println("Nome: ");
		func.nome = scan.nextLine();
		System.out.println("Salário Bruto: ");
		func.salario = scan.nextDouble();
		System.out.println("Desconto: ");
		func.imposto = scan.nextDouble();
		
		
		System.out.println(func.informacoesFuncionario());
		
		System.out.println("quantos % deseja adicionar ao salário? ");
		double bonus = scan.nextDouble();
		func.aumentoSalario(bonus);
		System.out.println(func.informacoesFuncionario());
		
		
		scan.close();

	}

}
