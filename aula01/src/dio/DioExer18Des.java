package dio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DioExer18Des {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Telefonou para a vítima?");
		String opcOne = scanner.next();
		System.out.println("Esteve no local do crime?");
		String opcTwo = scanner.next();
		System.out.println("Mora perto da vítima?");
		String opcThree = scanner.next();
		System.out.println("Devia para a vítima?");
		String opcFour = scanner.next();
		System.out.println("Já trabalhou com a vítima?");
		String opcFive = scanner.next();

		List<String> decisions = new ArrayList<String>() {
			{
				add(opcOne);
				add(opcTwo);
				add(opcThree);
				add(opcFour);
				add(opcFive);
			}
		};
		Iterator<String> decision = decisions.iterator();
		int suspectLevel = 0;
		while (decision.hasNext()) {
			String alt = decision.next();
			if (alt.equalsIgnoreCase("sim"))
				suspectLevel++;
		}
		String situation = null;
		switch (suspectLevel) {
		case 0:
		case 1:
			situation = "Inocente";
			break;
		case 2:
			situation = "Suspeita";
			break;
		case 3:
		case 4:
			situation = "Cúmplice";
			break;
		case 5:
			situation = "Assasina!!!!!";
		}

		System.out.println("Pela nossa análise, você é " + situation);
	}
}
