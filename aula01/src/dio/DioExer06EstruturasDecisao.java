package dio;

public class DioExer06EstruturasDecisao {
	public static void main(String[] args) {
		int nota = 5;

		if (nota >= 7) {
			System.out.println("Aprovado");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Prova de Recuperação");
		} else {
			System.out.println("Reprovado");
		}
	}
}
