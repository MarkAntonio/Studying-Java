package aula01;

public class ControleFluxo3 {
	public static void main(String[] args) {
		int counter = 0;
		while (counter < 10) {
//			System.out.println(counter + 1);
//			counter++;
			System.out.println(counter++ + 1);
		}
		// O do while, mesmo ele estando falso, ele executa pelo menos umas vez
		do {
			System.out.println("Dentro do do while");
		} while (counter < 10);

		for (int i = 0; i < 10; i++) {
			System.out.println("valor i é: " + i);
		}
	}
}
