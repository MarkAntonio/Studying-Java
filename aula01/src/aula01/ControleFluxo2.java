package aula01;

public class ControleFluxo2 {
	public static void main(String[] args) {
		byte day = 6;

		// As varíaveis que podem ir no switch são:
		// char, int, byte, short, emun, String (a partir do java 7)
		switch (day) {
		case 1:
			System.out.println("Monday.");
			break;
		case 2:
			System.out.println("Tuesday.");
			break;
		case 3:
			System.out.println("Wednesday.");
			break;
		case 4:
			System.out.println("Thursday.");
			break;
		case 5:
			System.out.println("Friday.");
			break;
		case 6:
			System.out.println("Saturday.");
			break;
		case 7:
			System.out.println("Sunday.");
			break;
		default:
			System.out.println("Invalid option.");
		}

		String genre = "F";
		switch (genre) {
		case "F":
			System.out.println("Feminino - Muié femi");
			break;
		case "M":
			System.out.println("Masculino - Homi macho");
		}
	}
}
