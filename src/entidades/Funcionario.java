package entidades;

public class Funcionario {
	public String nome;
	public double salario;
	public double imposto;
	public double bonus;

	public double salarioLiquido() {
		return salario - imposto;
		
	}
	
	public void aumentoSalario(double bonus) {

		salario += (salario * bonus) / 100.0;
		
	}

	
	
	public String informacoesFuncionario() {
		return  "Funcionario: " + nome +", Salário Líquido: " + String.format("%.3f", salarioLiquido());
	
	}
}
