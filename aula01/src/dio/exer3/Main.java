package dio.exer3;

public class Main {
	public static void main(String[] args) {
		//Sobrecarga
		System.out.println("Área do quadrado: " + Quadrilatero.area(4));
		double areaRetangulo = Quadrilatero.area(4, 7);
		System.out.println("Área do retângulo: " + areaRetangulo);
		System.out.println("Área do trapézio: " + Quadrilatero.area(2, 3, 5));
	}
}
