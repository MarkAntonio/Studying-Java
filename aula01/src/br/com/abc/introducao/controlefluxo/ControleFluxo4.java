package br.com.abc.introducao.controlefluxo;

public class ControleFluxo4 {
	public static void main(String[] args) {
		double total_value = 30000.0;
		for (int installment = 1; installment <= total_value; installment++) {
			double installment_value = total_value / installment;
//			if (installment_value >= 1000) {	
//				System.out.println(installment + " Parcelas de R$ " + (double) (int) installment_value);
//			}
//			else {
//				System.out.println("Saindo do laço");
//				break;
//			}
			if (installment_value < 1000) {
				break;
			}
			System.out.println(installment + " Parcelas de R$ " + (double) (int) installment_value);
		}
		// Dá no mesmo tanto o for quanto o while
		int installment = 1;
		double installment_value = total_value;
		while (installment_value >=1000) {
			System.out.println(installment + " Parcelas de R$ " + (double) (int) installment_value);
			installment++;
			installment_value = total_value / installment; 
			
		}
	}
}
