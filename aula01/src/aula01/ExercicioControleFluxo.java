package aula01;

public class ExercicioControleFluxo {
	public static void main(String[] args) {
		double salary = 5000.0;
		double fee;
		if (salary < 1000.0) {
			fee = 0.05;
		} else if (salary < 2000) {
			fee = 0.1;
		} else if (salary < 4000) {
			fee = 0.15;
		} else {
			fee = 0.2;
		}
		System.out.println("Com o salário de R$ " + salary + ", sua taxa é de " + (int) (fee * 100) + "%.");

	}
}
