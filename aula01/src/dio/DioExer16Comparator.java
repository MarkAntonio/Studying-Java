package dio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DioExer16Comparator {
	public static void main(String[] args) {
	
		List<Gato> meusGatos = new ArrayList<>() {{
			add(new Gato("Pandora", 4, "preta"));
			add(new Gato("Gaspar", 24, "marrom com branco"));
			add(new Gato("Frajola", 30, "preto e branco"));
		}};
		
		System.out.println("Ordem de Inserção");
		System.out.println(meusGatos);
		
		Collections.shuffle(meusGatos);
		
		System.out.println("Ordem Aleatória");
		System.out.println(meusGatos);
		
		System.out.println("Ordem Natural (nome)");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("Ordem Idade");
		Collections.sort(meusGatos, new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("Ordem Cor");
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		meusGatos.get(2).setNome("Gaspar");
		
		
		System.out.println("Ordem Nome/Idade/Cor");
		//se o nome for igual, com para a idade, se for igual, compara a cor, se também for, aí ele é igual.
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
	}
	
	
}

class Gato implements Comparable<Gato>{
	private String nome;
	private int idade;
	private String cor;
	
	public Gato(String nome, int idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}


	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "{nome=" + nome + ", idade=" + idade + ", cor=" + cor + "}";
	}

	@Override
	public int compareTo(Gato o) {
		// TODO Auto-generated method stub
		return this.getNome().compareToIgnoreCase(o.getNome());
		//return um int, porque se der 0 quer dizer que comparando o gato atual com o próximo gato da lista, os nomes são iguais
		// se der 1 quer dizer que o gato atual é maior que o próximo.
		// Se der -1 quer dizer que o próximo gato é maior que o atual.
	}	
}

class ComparatorIdade implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}

class ComparatorCor implements Comparator<Gato>{
	
	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
}

class ComparatorNomeCorIdade implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if (nome != 0) return nome;
		
		int cor	= g1.getCor().compareToIgnoreCase(g2.getNome());
		if (cor != 0) return cor;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
			
		}
}
