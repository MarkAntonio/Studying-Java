package dio.DioExer14Exception;

public class CepFormatter {
	public static void main(String[] args) {
		try {
			String cepFormatado = formatCep("56180000");
			System.out.println(cepFormatado);
		} catch (InvalidCepException e) {
			System.out.println("O cep não corresponde com as regras de negócio.");
		}
	}
	static String formatCep(String cep) throws InvalidCepException{
		if (cep.length() != 8)
			throw new InvalidCepException();
		
		//simulando um cep formatado
		return "56.180-000";
	}
}
