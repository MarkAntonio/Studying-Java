package dio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DioExer15 {
	public static void main(String[] args) {
		List<Double> score = new ArrayList<Double>();
		score.add(7.0);
		score.add(2.5);
		score.add(9.3);
		score.add(5.0);
		score.add(6.0);
		score.add(0.0);
		score.add(3.6);
		System.out.println(score);

		System.out.println("Exiba a posição da nota 5.0: " + score.indexOf(5.0));
		System.out.println("Adicione na lista a nota 9, na posição 4");
		score.add(4, 9.5);
		System.out.println(score);

		System.out.println("Substitua a nota 6.0 pela nota 7.8");
		score.set(score.indexOf(5d), 7.8);
		System.out.println(score);

		System.out.println("Confira se a nota 5.0 ainda está na lista: " + score.contains(5d));

		System.out.println("Exiba a terceira nota adicionada: " + score.get(2));
		System.out.println(score.toString());

		System.out.println("Exiba a menor nota: " + Collections.min(score));

		System.out.println("Exiba a maior nota: " + Collections.max(score));

		System.out.println("Exiba a soma dos valores: ");
		Iterator<Double> iterator = score.iterator();
		double sum = 0;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			sum += next;
		}

		System.out.println(sum);
		sum = 0;
		for (double nota : score) {
			sum += nota;
		}
		System.out.println("Aqui foi usando só foreach: " + sum);

		System.out.println("Média: " + sum / score.size());

		System.out.println("Remova a nota 0");
		// neste caso, se eu colocar só o 0 ele remove o index 0, se eu colocar 0d ou
		// 0.0 aí é que ele remove o valor 0
		// essa função remove é sobrecarregada.
		score.remove(0d);

		System.out.println(score);
		Iterator<Double> iterator2 = score.iterator();

		while (iterator2.hasNext()) {
			Double next = iterator2.next();
			if (next < 7)
				iterator2.remove();
		}
		System.out.println(score);

		System.out.println("Apague toda a lista");
//		score.clear();
		System.out.println(score);

		System.out.println("A ArrayList está vazia? " + score.isEmpty());
		
		LinkedList<Double> notas2 = new LinkedList<>();
		for(double nota: score) {
			notas2.add(nota);
		}
		System.out.println(notas2);


		System.out.println("Primeira nota da LinkedList: " + notas2.getFirst());
		System.out.println("Mostrando a última nota da LinkedList removendo-a: " + notas2.removeLast());
		
		System.out.println(notas2);
		
	}
}
