package aula01;

public class Arrays1 {
	public static void main(String[] args) {
		int [] idades = new int[3];
					  //tamanho do array
		// um array é sempre um objeto. ele possui somente os tipos primitivos descritos na hora de criar o objeto.
		idades[0] = 9;
		idades[1] = 56;
		idades[2] = 27;
		for (int i = 0; i < 3; i++) {
			System.out.println(idades[i]);
		}
	}
}
