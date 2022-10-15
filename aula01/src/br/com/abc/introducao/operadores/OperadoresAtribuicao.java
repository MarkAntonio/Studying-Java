package br.com.abc.introducao.operadores;

public class OperadoresAtribuicao {
	public static void main(String[] args) {
		// =, -=, +=, *=, /=, %=, -- ++
		int salario = 1800;
//		salario += 1000;
		salario--;
		salario -= 1;
		salario++;
		salario += 1;

//		salario = salario + salario * 0.1;  eu não posso fazer assim, porque quando eu multiplico um número int por um número decimal
		// automaticamente ele se torna um tipo double. Então eu tenho que forçar um cast (trocar o tipo) 
		// para que dê certo. eu faço isso coloando o (int) antes da conta. Lembrando de colocar o cálculo entre parênteses para funcionar.
		salario = salario + (int) (salario*0.1);
		System.out.println(salario);
	}
}
