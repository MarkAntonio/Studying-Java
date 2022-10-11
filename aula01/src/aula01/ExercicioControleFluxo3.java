package aula01;

public class ExercicioControleFluxo3 {
	public static void main(String[] args) {
		for (int number = 0; number <= 10000; number++) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
	}
}