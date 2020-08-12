package entidades;

public class Produto {
	public String nome;
	public double preco;
	public int qtd;

	public double valorEstoque() {
		double valor = preco * qtd;
		return valor;
	}

	public void adicionarProduto(int qtd) {

		this.qtd += qtd;
	}

	public void removerProduto(int qtd) {

		this.qtd -= qtd;
	}
	
	public String extrato() {
		return nome
				+ ", $ "
				+ String.format("%.2f", preco)
				+ ", "
				+ qtd
				+ " units, Total: $ "
				+ String.format("%.2f", valorEstoque());
	}
	
}
