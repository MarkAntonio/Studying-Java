package dio;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class DioExer20OrdenacaoSet {
	public static void main(String[] args) {
		System.out.println("Ordem aleatória");
		Set<Louvor> meusLouvores = new HashSet<Louvor>() {{
			add(new Louvor("Sabe", "Canção e Louvor", 4));
			add(new Louvor("O Chamar do Espírito Santo", "Renan Tenóro", 3));
			add(new Louvor("Deserto", "Marial Maçal", 4));
		}};
		System.out.println(meusLouvores);	
		
		System.out.println("Ordem de inserção");
		Set<Louvor> meusLouvores1 = new LinkedHashSet<Louvor>() {{
			add(new Louvor("Sabe", "Canção e Louvor", 4));
			add(new Louvor("O Chamar do Espírito Santo", "Renan Tenóro", 3));
			add(new Louvor("Deserto", "Marial Maçal", 4));
		}};
		System.out.println(meusLouvores1);	
		
		System.out.println("Ordem Natural (Duracao)");
		Set<Louvor> meusLouvores2 = new TreeSet<>(meusLouvores1);
		System.out.println(meusLouvores2);
		
		Set<Louvor> meusLouvores3 = new TreeSet<>(new ComparatorNomeCantorDuracao());
		System.out.println(meusLouvores2);
		}
}


class Louvor implements Comparable <Louvor>{
	private String nome;
	private String cantor;
	private Integer duracao;

	public Louvor(String nome, String cantor, Integer duracao) {
		this.nome = nome;
		this.cantor = cantor;
		this.duracao = duracao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCantor() {
		return cantor;
	}
	
	public Integer getDuracao() {
		return duracao;
	}
	
	@Override
	public String toString() {
		return "{nome=" + nome + ", cantor=" + cantor + ", duracao=" + duracao + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantor, duracao, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Louvor other = (Louvor) obj;
		return Objects.equals(cantor, other.cantor) && duracao == other.duracao && Objects.equals(nome, other.nome);
	}
	
	@Override
	public int compareTo(Louvor o) {
		int duracao =  Integer.compare(this.getDuracao(), o.getDuracao());
		if (duracao != 0) return duracao;
		return this.getCantor().compareTo(o.getCantor());
	
		}
	
	
}

/*class ComparatorCantor implements Comparator<Louvor>{
	@Override
	public int compare(Louvor l1, Louvor l2) {
		return l1.getCantor().compareToIgnoreCase(l2.getCantor());
	}
}

class Comparatorduracao implements Comparator<Louvor>{
	
	@Override
	public int compare(Louvor l1, Louvor l2) {
		return Integer.compare(l1.getDuracao(), l2.getDuracao());
	}
}
*/
class ComparatorNomeCantorDuracao implements Comparator<Louvor> {
	@Override
	public int compare(Louvor l1, Louvor l2) {
		int nome = l1.getNome().compareTo(l2.getNome());
		if (nome != 0)
			return nome;

		int cantor = l1.getCantor().compareTo(l2.getCantor());
		if (cantor != 0) {
			return cantor;
		}
		
		return Integer.compare(l1.getDuracao(), l2.getDuracao());
		
	}

}