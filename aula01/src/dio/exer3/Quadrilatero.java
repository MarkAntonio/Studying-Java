package dio.exer3;

public class Quadrilatero {
	//Sobrecarga
	public static double area(double lado) {
		return lado * lado;
	}

	public static double area(double altura, double largura) {
		return altura * largura;
	}

	public static double area(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura) / 2;
	}
}
