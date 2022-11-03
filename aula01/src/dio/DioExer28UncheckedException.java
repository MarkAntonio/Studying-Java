package dio;

import javax.swing.*;

//Unchecked exception (Runtime): podem ser evitados se forem tratados e analisados pelo desenvolvedor;

public class DioExer28UncheckedException {
	public static void main(String[] args) {
		boolean continueLooping = true;
		do {
			String a = JOptionPane.showInputDialog("Numerador: ");
			String b = JOptionPane.showInputDialog("Denominador: ");
			
			try {
				int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
				System.out.println("Resultado: " + resultado);
				continueLooping = false;
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Entrada inválida, informe somente números inteiros " + e.getMessage());
//				e.printStackTrace();
				System.out.println("Chegou no catch");
					
			} catch (ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0.");
			}
			
			finally {
				System.out.println("Chegou no Finally");
			}
			
			
			System.out.println("Chegou até aqui...");
		}
		while (continueLooping) ;
			
	
	}
	
	public static int dividir(int a, int b) {return a / b;}
}
