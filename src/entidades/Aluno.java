package entidades;

public class Aluno {
	public double nota1;
	public double nota2;
	public double nota3;
	public double notaFinal;
	
	
	public String notaFinal() {
		notaFinal = (nota1 + nota2 + nota3) / 3;
		return "NOTA FINAL: " + String.format("%.1f",(notaFinal) );
	}
	
	public String avaliacao() {
		if(notaFinal > 6.0) {
			return "Aprovado!";
		}else {
			return "Reprovado: " + "Faltou " +String.format("%.1f",(6.0 - notaFinal) ) 
			+ " pontos para chegar a 6.0";
		}
	}
}
