package aplication;

import java.util.Scanner;

import entidades.Produto;

public class MainProduto {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		Produto produtos = new Produto();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		produtos.nome = scan.nextLine();
		System.out.print("Preço: ");
		produtos.preco = scan.nextDouble();
		System.out.print("Quantidade: ");
		produtos.qtd = scan.nextInt();
		
		System.out.println("extrato atual: " + produtos.extrato());
		
		
		
		System.out.println("digite a quantidade de produtos que deseja adicionar: ");
		int qtd = scan.nextInt();
		produtos.adicionarProduto(qtd);
		System.out.println("produtos adicionados, extrato atual: ");
		System.out.println(produtos.extrato());
		
		System.out.println("digite a quantidade de produtos que deseja remover: ");
		qtd = scan.nextInt();
		produtos.removerProduto(qtd);
		System.out.println("produtos removidos, extrato atual: ");
		System.out.println(produtos.extrato());
		scan.close();

	}

}
