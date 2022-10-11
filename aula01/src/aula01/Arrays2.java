package aula01;

public class Arrays2 {
	public static void main(String[] args) {
		// Quando criamos uma array, temos que definir o tamanho dela. 
		// Dependendo do tipo primitivo ela é preenchida com certos valores.
		// int, double, float, short, byte, long = 0
		// char = '\u0000'
		// boolean = false
		// String = null
		String [] idades = new String [3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Idade "+ (i + 1) + ": " + idades[i]);
		}
		
		String [] nomes = new String [3];
		nomes[0] = "Marco";
		nomes[1] = "Clarice";
		nomes[2] = "Josefa";
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Nome "+ (i + 1) + ": " + nomes[i]);
		}
	}
}
