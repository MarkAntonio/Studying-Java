package dio;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class DioExer22Des {
	public static void main(String[] args) {
		Set <FavoriteLanguage> langs = new LinkedHashSet<>(Arrays.asList(
				new FavoriteLanguage("Python", 1991, "Pycharm"),
				new FavoriteLanguage("Java", 1991, "Eclipse"),
				new FavoriteLanguage("JavaScript", 2000, "VSCode")));
		
		
		System.out.println("Mostrar por ordem de inserção: " + langs);
		
		Set <FavoriteLanguage> langs2 = new TreeSet<>(langs);
		System.out.println("Ordem natural (nome): " + langs2);
		
		
		Set <FavoriteLanguage> langs3 = new TreeSet<>(new ComparatorIde());
		System.out.println("Ordem por IDE: " + langs3);
		
	
		
	}
	
	
}

class FavoriteLanguage implements Comparable <FavoriteLanguage>{
	String name;
	Integer creationYear;
	String ide;
	public FavoriteLanguage(String name, Integer creationYear, String ide) {
		this.name = name;
		this.creationYear = creationYear;
		this.ide = ide;
	}
	
	public String getName() {
		return name;
	}
	public Integer getCreationYear() {
		return creationYear;
	}
	public String getIde() {
		return ide;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", creationYear=" + creationYear + ", ide=" + ide + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(creationYear, ide, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FavoriteLanguage other = (FavoriteLanguage) obj;
		return Objects.equals(creationYear, other.creationYear) && Objects.equals(ide, other.ide)
				&& Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(FavoriteLanguage o) {
		int nome = this.getName().compareTo(o.getName());
		return nome;
	}
}

class ComparatorIde implements Comparator<FavoriteLanguage>{
	@Override
	public int compare(FavoriteLanguage l1, FavoriteLanguage l2) {
		int ide = l1.getIde().compareTo(l2.getIde());
		return ide;
	}
}