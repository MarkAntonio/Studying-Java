package dio.exer1;


public class Main {
	public static void main(String[] args) {
		System.out.println("Exercício calculadora");
		Calculator.add(2, 4);
		Calculator.sub(5.5, 2.5);
		Calculator.div(10, 4);
		Calculator.mult(5, 12);
		
		System.out.println("Exercício da mensagem");
		DailyMessage.message(5);
		DailyMessage.message(13);
		DailyMessage.message(20);
		
		System.out.println("Exercício Empréstimo");
		Loan.calculate(1000, Loan.getTwoInstallment());
		Loan.calculate(1000, Loan.getThreeInstallment());
		
	}
}
