package dio.exer2;

public class Quadrilatero {
	//Sobrecarga
	public static void area(double lado) {
		System.out.println("Área do quadrado: " + lado * lado);
	}

	public static void area(double altura, double largura) {
		System.out.println("Área do retângulo: " + altura * largura);
	}

	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
	}
}
