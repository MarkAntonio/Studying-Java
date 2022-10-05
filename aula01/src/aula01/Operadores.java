package aula01;
// operações unárias...
public class Operadores {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		System.out.println(number1 + number2);
		int soma = number1 + number2;
		System.out.println("A soma é "+soma);
		double number3 = 10.0;
		double number4 = 20.0;
		int divisao = number1 / number2;
		System.out.println("A divisão é: "+divisao);  // como o número é intero, não vai mostrar 0.5 e sim 0
		System.out.println("A subtração é: "+ (number1 - number2));
		System.out.println("A divisão é: "+ (number3 / number4));  // sendo double ele mostra o 0.5 completo.
		System.out.println("O resto é: " +(number1 % number2 + "\n"));
		System.out.println(number1 > number2);
		System.out.println(number1 < number2);
		System.out.println(number1 == number2);
		System.out.println(number1 != number2);
		
	}

}
