package br.com.abc.introducao.controlefluxo;

public class ControleFluxo {
	public static void main(String[] args) {
		int age = 39;
//		String category = null;
//		if (age >= 20) {
//			System.out.println("Já tá grandim, bora trabaia?");
//			category = "veio";
//		} else if (age < 20 && age > 10) {
//			System.out.println("Tá novo ainda, mas vamo começar a pensar.");
//			category = "novim";
//		}
		String category;
		category = age >= 20 ? "Tá veinho em" : "Novo todo meu fi!";
		System.out.println(category);
		
		// dá até pra colocar um operador ternário dentro de outro, mas aí começa a ficar difícil de ler;
		//ex
		// if age < 11 "criança"
		// else if age < 18  "adolescente"
		// else if age <= 35 "Jovem"
		// else "adulto"
		String faixa_etaria;
		faixa_etaria = age < 11 ? "criança" : age < 18 ? "adolescente" : age <= 35? "jovem" : "adulto";
		System.out.println("Faixa etária: " + faixa_etaria);

	}
}
