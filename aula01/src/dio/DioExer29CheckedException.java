package dio;

import javax.swing.*;
import java.io.*;

//Checked Exceptions: devem ser evitados se forem tratados e analisados pelo desenvolvedor;

public class DioExer29CheckedException {
	public static void main(String[] args) {
		String nomeDoArquivo = "seila.txt";
		try {
			imprimirArquivoNoConsole(nomeDoArquivo);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado. Verifique o nome. " + e.getCause());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! Entre em contato com o suporte. " + e.getCause());
			e.printStackTrace();
		} finally {
			System.out.println("chegou no finally");
		}

		System.out.println("Apesar da exception ou não, o programa continua...");
	}

	public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
		File file = new File(nomeDoArquivo);

		BufferedReader br = new BufferedReader(new FileReader(file.getName()));
		String line = br.readLine();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		do {
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		} while (line != null);
		bw.flush();
		br.close();

	}
}
