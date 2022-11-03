package dio;

import java.text.NumberFormat;
import java.text.ParseException;

public class DioExer13TryCatch {
	public static void main(String[] args) {
		//Exemplo exceção
		Number valor;
		try {
			valor = NumberFormat.getInstance().parse("a10.5");
			System.out.println(valor);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
