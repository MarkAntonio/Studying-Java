package dio.DioExer25Des;

public class Main {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario(); //instância normal
		
		Funcionario gerente = new Gerente(); //upcast - nada de perde
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		
		
		Faxineiro faxineiro2 = (Faxineiro) new Funcionario(); //downcast - alguma coisa se perde
		Vendedor vendedor2 = (Vendedor) new Funcionario();
	}
}
