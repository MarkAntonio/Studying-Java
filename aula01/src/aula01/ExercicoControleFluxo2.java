package aula01;

public class ExercicoControleFluxo2 {
	public static void main(String[] args) {
		short day = 5;
		switch(day) {
		case 1:
			//Sunday
		case 7:
			System.out.println("Weekend");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Weekday");
			break;
	
		default:
			System.out.println("Tá tudo errado meu fi");
			
		}
	}
}
