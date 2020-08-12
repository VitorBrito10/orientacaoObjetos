package util;

public class Conversao {

	public static double IOF = 0.06;
	public static double dollarToReal(double cotacao, double qtdDolar) {
	return cotacao * qtdDolar * (1.0 + IOF);
	}

}
