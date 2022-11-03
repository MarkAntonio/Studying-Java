package dio; 

public class DioExer23OO {
	public static void main(String[] args) {
		Carro car = new Carro("Preto", "Corsa", 22);
		System.out.println("A cor do " + car.getModelo() + " é " + car.getCor());
		car.setCor("Branco");
		System.out.println("A cor do " + car.getModelo() + " agora é " + car.getCor());
		double total = car.totalValorTanque(5.6);
		System.out.println("O valor total do tanque é: R$" + total);
	}
}

class Carro{
	private String cor;
	private String modelo;
	private int capacidadeTanque;
	
	Carro(String cor, String modelo, int capacidadeTanque){
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}	
	
	void setCor(String cor) {
		this.cor = cor;
	}
	
	String getCor() {
		return cor;
	}
	
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	String getModelo() {
		return modelo;
	}
	
	void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque= capacidadeTanque ;
	}
	
	int getCapacidadeTanque(){
		return capacidadeTanque;
	}	
	
	double totalValorTanque(double valorCombustível) {
		return capacidadeTanque * valorCombustível;
	}
}