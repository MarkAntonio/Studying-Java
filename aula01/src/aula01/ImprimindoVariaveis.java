package aula01;

public class ImprimindoVariaveis {
	// Comentário de uma linha
	public static void main(String[]args) {
		int number;
		number = 40;
		int idade = 10;
		System.out.println("Dados Impressos");
		System.out.println("Idade: " + idade);
		System.out.println(number);
		if (number >= 40) {
			System.out.println("Teu pai tá é veio.");
		}
		else 
			System.out.println("Tá novin em.");
		int age = 30;
		double salary_double = 3000;
		float salary_float = 3000;
		byte age_byte = 24;
		short age_short = 32767;
		boolean verdadeiro = true;
		boolean falso = false;
		long big_number = 3000L;
		char caractere = 'A';  //2 bytes - permites kanjis japoneses, chineses et
		// no char: ou eu coloco um numero inteiro (menor que 2 bytes) e ele vai traduzir para a tabela unicode, ou eu coloco o valor representando exadecimal
		char caractere2 = '\u0042';
		String name = "Marco";
		System.out.println(caractere);
		System.out.println(caractere2);
		
			
		
	}
	/*
	 Comentário maior que uma linha
	 */
	
	/***
	 * Comentário para documentação (de classes e funções)
	 */
}
