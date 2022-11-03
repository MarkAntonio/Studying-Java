package dio;

public class DioExer01FuncoesCalculadora {
	public static void main(String[] args) {
		int n1 = 30;
		int n2 = 15;
		operations(n1, n2);
	}

	public static void print(String msg) {
		System.out.println(msg);
	}

	public static void operations(int a, int b) {
		int soma = add(a, b);
		print("Soma: " + soma);
		
		print("Subtração: " + sub(a, b));
		
		div(a, b);
		mult(a, b);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static void div(int a, int b) {
		print("Divisão: " + a / b);
	}

	public static void mult(int a, int b) {
		print("Multiplicação: " + a * b);
	}

}
