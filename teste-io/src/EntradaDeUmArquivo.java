import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {

	public static void main(String[] args) throws IOException {
		/*
		 * InputStream is = new FileInputStream("arquivo.txt");
		 * InputStreamReader isr = new InputStreamReader(is); BufferedReader br
		 * = new BufferedReader(isr);
		 */

		Scanner entrada = new Scanner(System.in);
		PrintStream saida = new PrintStream("copia.txt");

		/*
		 * OutputStream os = new FileOutputStream("saida.txt");
		 * OutputStreamWriter osw = new OutputStreamWriter(os); BufferedWriter
		 * bw = new BufferedWriter(osw);
		 * 
		 * System.out.println("Digite sua msg!"); String s = br.readLine();
		 */

		/*
		 * while (s != null) { System.out.println(s); s = br.readLine(); }
		 * br.close();
		 */

		while (entrada.hasNextLine()) {
			saida.println(entrada.nextLine());
		}
		saida.close();
		entrada.close();

	}

}
