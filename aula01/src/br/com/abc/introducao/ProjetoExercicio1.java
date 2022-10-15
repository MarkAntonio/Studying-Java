package br.com.abc.introducao;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProjetoExercicio1 {
	public static void main(String[] args) {
		//intanciando o objeto ArrayList
		List<String> students = new ArrayList<String>();
		//programa de cadastro de alunos
		//student registration program
		System.out.println("=======Cadastro de alunos========");
		int counter = 1;
		while (true) {
			System.out.println("Digite o nome do "+ counter + "º aluno: ");
			Scanner input = new Scanner(System.in);
			String name = input.next();
			students.add(name);
			System.out.println("Digite n para parar: ");
			Scanner op= new Scanner(System.in);
			String option = op.next();
			// se eu comparar com o == ele retorna false, porque o tipo String padrão do java (jvm) é diferente do 
			// String do Scanner;

			if (option.equals("n")){
				break;
			}
			
			//eu poderia tambem ter feito: option.intern() == "n"; que daria certo
				
			counter++;
		}
		counter = 1;
		for (String student: students) {
			System.out.println("Aluno " + counter + ": " + student);
			counter++;
		}
	}	
}	
