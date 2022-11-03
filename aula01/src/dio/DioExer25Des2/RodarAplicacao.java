package dio.DioExer25Des2;

public class RodarAplicacao {
	public static void main(String[] args) {
		
		//Polimorfismo
		ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
		
		for (ClasseMae classe: classes) {
			classe.metodo1(); //Aqui é polimorfismo pois ele está acessando os métodos sobrescritos
		}
		
		System.out.println("");
		
		for (ClasseMae classe: classes) {
			classe.metodo2(); //Aqui também é polimorfismo, mas quando ele chega no método da classe 2 ele deixa de ser. 
		}
		
		System.out.println("");
		
		//Sobrescrita
		ClasseFilha2 classeFilha2 = new ClasseFilha2();
		classeFilha2.metodo2(); // aqui é uma sobrescrita normal, pois o tipo é o mesmo do objeto.
	}
}
