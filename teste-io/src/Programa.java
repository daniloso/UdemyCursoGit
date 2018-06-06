import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Programa {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
								new InputStreamReader(
										new FileInputStream("arquivo.txt")));
		
		String linha = br.readLine();
		//System.out.println(linha);
		
		while (linha!=null){
			System.out.println(linha);
			linha=br.readLine();
		}
		/*System.out.println("Digite sua msg!");
		String s = br.readLine();
		
		while (s !=null){
			System.out.println(s);
			s=br.readLine();
		}*/
		br.close();
	}

}
