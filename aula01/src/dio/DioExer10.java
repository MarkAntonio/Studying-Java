package dio;

public class DioExer10 {
	public static void main(String[] args) {
		String alunos[] = { "Clarice", "Fábio", "Neto", "Diana", "Ivanilde", "Marco" };
		for (int index = 0; index < alunos.length; index++) {
			System.out.println("O aluno no índice index = " + index + " é " + alunos[index]);
		}
		int counter = 0;
		for (String aluno: alunos) {
			System.out.println("O aluno no índice index = " + counter + " é " + aluno);
			counter++;
		}
	}
}
