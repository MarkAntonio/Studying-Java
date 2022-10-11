package aula01;

public class Arrays3 {
	public static void main(String[] args) {
		int[] numeros = new int[5];
		int[] numeros2 = { 1, 2, 3, 4, 5 }; // Len 5, index 0 a 4
		int[] numeros3 = new int[] { 10, 20, 30, 40, 50 };
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}

		// abaixo temos o foreach. ele designa a variável para cada posição de memória a
		// cada loop até terminarem as variáveis.
		for (int numero : numeros3) {
			System.out.println(numero);
		}

		String[] dados = { "Juju", "Shiau Shisha", "Fujino Nakonbi" };
		for (String nome : dados) {
			System.out.println(nome);
		}
	}
}
