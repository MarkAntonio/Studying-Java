package br.com.abc.introducao.operadores;

public class OperadoresLogicos {
	public static void main(String[] args) {
		int age = 18;
		float salary = 1210f;
		
		System.out.println("&& - operador and: " + (salary >= 3000 && age >= 18));
		System.out.println("|| - operador ou: " + (salary >= 3000 || age >= 18));
	}
}

