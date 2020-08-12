package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class MainAluno {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner scan = new Scanner (System.in);
		 Aluno aluno = new Aluno ();
		 System.out.println("digite a nota do B1: ");
		 aluno.nota1 = scan.nextDouble();
		 System.out.println("digite a nota do B2: ");
		 aluno.nota2 = scan.nextDouble();
		 System.out.println("digite a nota do B3: ");
		 aluno.nota3 = scan.nextDouble();
		 
		 System.out.println(aluno.notaFinal());
		 System.out.println(aluno.avaliacao());
		 
		 scan.close();

	}

}
