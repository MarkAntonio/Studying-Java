package dio;

public class DioExer04EstruturasDecisao {
	public static void main(String[] args) {
		double saldo = 25.0;
		double valorSolicitado = 25.0;
		
		if (valorSolicitado < saldo)
			saldo -= valorSolicitado;
		System.out.println(saldo);
	}
}
