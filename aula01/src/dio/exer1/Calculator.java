package dio.exer1;

public class Calculator {

	public static void add(double a, double b) {
		double res = a + b;
		System.out.println("O resultado da soma de " + a + " e " + b + " é: " + res);
	}

	public static void sub(double a, double b) {
		double res = a - b;
		System.out.println("O resultado da subtração de " + a + " e " + b + " é: " + res);
	}

	public static void div(double a, double b) {
		double res = a / b;
		System.out.println("O resultado da divisão de " + a + " e " + b + " é: " + res);
	}

	public static void mult(double a, double b) {
		double res = a * b;
		System.out.println("O resultado da multiplicação de " + a + " e " + b + " é: " + res);
	}

}