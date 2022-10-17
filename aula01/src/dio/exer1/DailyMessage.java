package dio.exer1;

public class DailyMessage {
	public static void message(int time) {
		if (time < 12 && time >= 4) {
			System.out.println("Bom dia!");
		}
		else if (time < 18) {
			System.out.println("Boa tarde!");
		}
		else if (time <= 23 || time >= 0){
			System.out.println("Boa noite!");
		}
		else {
			System.out.println("Hora inválida.");
		}
	}
}
