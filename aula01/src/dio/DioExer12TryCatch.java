package dio;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class DioExer12TryCatch {
	public static void main(String[] args) {
		try {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite seu nome: ");
		String nome = scanner.next();

		System.out.println("Digite seu sobrenome: ");
		String sobrenome = scanner.next();

		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();

		System.out.println("Digite sua altura em metros: ");
		double altura = scanner.nextDouble();

		System.out.println("Hello! I'm " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ".");
		System.out.println("I'm " + idade + " years old.");
		System.out.println("My height is: " + altura + " m.");
		scanner.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Os campo idade deve ser número inteiro e o campo altura deve ser número decimal (modelo EUA).");
		}
	}
}
