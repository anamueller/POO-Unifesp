import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipuladorArquivo {

	public static String leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "", l = "";
		while (true) {
			if (linha != null) {
				linha = buffRead.readLine();
				l = l + linha;
			} else
				break;
		}
		buffRead.close();
		return l;
	}
    
    public static void escritor(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Escreva algo: ");
		linha = s.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
		s.close();
	}

	public static void main(String args []) throws IOException{
		int count=0;
		String p="", c ="";
		System.out.printf("Escreva o nome do arquivo que deseja ler e o carácter a ser contado %s %s\n", p, c);
		Scanner s = new Scanner(System.in);
		p = s.nextLine();
		c = s.nextLine();
		String path = "/home/anamueller/Desktop/Study/VS Codes/POO/Ex16/" + p +".txt";
		String arquivo = leitor(path);
		char[] arq = new char[arquivo.length()];
		char[] carac = new char[1];
		carac[0]=c.charAt(0);
        for (int i = 0; i < arquivo.length(); i++) {
            arq[i] = arquivo.charAt(i);
        }
		for(int i=0; i<arquivo.length(); i++){
			if(arq[i] == carac[0]){
				count++;
			}
		}
		System.out.printf("Quantidade de %s: %d", c, count);
		s.close();
	}
}