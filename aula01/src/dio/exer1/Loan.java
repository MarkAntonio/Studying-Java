package dio.exer1;

public class Loan {
	
	public static int getTwoInstallment() {
		return 2;
	}
	
	public static int getThreeInstallment() {
		return 3;
	}
	
	public static double getTwoInstallmentFee() {
		return 0.3;
	}
	
	public static double getThreeInstallmentFee() {
		return 0.45;
	}
	
	public static void calculate(double value, int installment) {
		if (installment == 2) {
			double finalValue = value + (value * getTwoInstallmentFee());
			
			System.out.println("Valor final do empréstimo para 2 parcelas: R$ "+ finalValue);
		}
			
		else if (installment == 3) {
			double finalValue = value + (value * getThreeInstallmentFee()); 
			System.out.println("Valor final do empréstimo para 3 parcelas: R$ "+ finalValue);
			System.out.println();
		}
		
		else {
			System.out.println("Quantidade de parcelas não aceita.");
		}
	}
	
}
