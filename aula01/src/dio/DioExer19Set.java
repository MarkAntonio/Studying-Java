package dio;

import java.nio.charset.CoderResult;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DioExer19Set {
	public static void main(String[] args) {

		System.out.println("Crie u m conjunto e adicione as notas:");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas);
		/*
		 * o set não tem como obter o index, depois de adicinado ele mostra de uma forma
		 * diferente. E não há como ter números repetidos, uma vez que eu coloco ele não
		 * entra.
		 * 
		 * Não tenho como adicionar um valor no index escolhido, ou substituir uma nota
		 * por outra.
		 */

		System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

		System.out.println("Exiba a menor nota: " + Collections.min(notas));

		System.out.println("Exiba a maior nota: " + Collections.max(notas));

		Iterator<Double> iterator = notas.iterator();

		double soma = 0;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println(soma);

		System.out.println("Exia a média das notas: " + (soma / notas.size()));

		System.out.println("Remova a nota 0");

		notas.remove(0d);
		System.out.println(notas);

		// Não tenho como remover em uma posição específica

		System.out.println("Remova as notas menores que 7 e exiba");

		Iterator<Double> iterator2 = notas.iterator();
		while (iterator2.hasNext()) {
			if (iterator2.next() < 7)
				iterator2.remove();
		}
		System.out.println(notas);

		System.out.println("Exiba todas as notas na ordem em que foram informados");

		// Set <Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d,
		// 0d, 3.6));

		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);

		System.out.println(notas2);

		System.out.println("Exiba todas as notas na ordem crescente");

		// eu só posso fazer isso se a classe tiver o comparable ou eu criá-lo
		Set<Double> notas3 = new TreeSet<>(notas2);

		System.out.println(notas3);

		System.out.println("Apague todo o conjunto (HashSet)");
		notas.clear();
		System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());


	}

}


