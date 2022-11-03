package dio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class DioExer21Des {
	public static void main(String[] args) {
		Set<String> coresArcoIris = new HashSet<String>();
		coresArcoIris.add("Vermelho");
		coresArcoIris.add("Laranja");
		coresArcoIris.add("Amarelo");
		coresArcoIris.add("Verde");
		coresArcoIris.add("Azul");
		coresArcoIris.add("Anil");
		coresArcoIris.add("Violeta");

		System.out.println("A. Cores do Arco Íris");
		Iterator<String> iterator = coresArcoIris.iterator();
		int counter = 0;
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			counter++;
		}
		System.out.println("B. A quantidade de cores que o arco íris tem é: " + counter);

		Set<String> organizedColors = new TreeSet(coresArcoIris);
		System.out.println("C. Cores do arco íris em ordem alfabética: " + organizedColors);

		System.out.println("D. Cores que começam com a letra V:");
		Iterator<String> iterator2 = coresArcoIris.iterator();
		while (iterator2.hasNext()) {
			String cor = iterator2.next();
		}
		List<String> reverse = new ArrayList(coresArcoIris);
		Collections.reverse(reverse);

		System.out.println("E. As cores na ordem inversa de inserção é: " + reverse);

		System.out.println("F. Mostrando somente as cores que começam com V");

		for (String cor : coresArcoIris) {
			String letra = cor.substring(0,1);
			if (letra.equals("V"))
				System.out.println(cor);
		}

			System.out.println("G. Removendo as cores que começam com V");

		coresArcoIris.removeIf(cor -> cor.startsWith("V"));
		System.out.println(coresArcoIris);

		coresArcoIris.clear();
		System.out.println("H. O conjunto está vazio? " + coresArcoIris.isEmpty());
	}
}
