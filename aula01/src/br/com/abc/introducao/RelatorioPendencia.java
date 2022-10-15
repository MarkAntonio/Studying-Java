package br.com.abc.introducao;

public class RelatorioPendencia {
	public static void main(String[] args) {
		String name;
		String address;
		String phone;
		name = "Bolsonaro";
		address = "Palácio do Planalto, Brasília-DF";
		phone = "(11) 99405-1234";
		System.out.println("O "+name+" domiciliado no endereço "+address+" e telefone "+phone+" não possui pendências.");
		
		String genre;
		String age;
		String marital_status;
		String salary;
		genre = "F";
		age = "28";
		marital_status = "Casada";
		salary = "1875,00";
		if (genre == "F")
			genre = "feminino";
		System.out.println("O/A trabalhador(a) "+name+" do sexo "+genre+", idade "+ age+", estado civil "+marital_status+" e salário "+salary+" encontra-se empregado(a) nesse estabelecimento.");
	}
}
