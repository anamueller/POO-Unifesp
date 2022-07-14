import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex2 {

    public static String leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "", l="";
		while (true) {
            linha = buffRead.readLine();
			if (linha != null) {
                l = l + "\n" + linha;
			} else
				break;
		}
		buffRead.close();
		return l;
	}

    public static void escritor(String path, String linha) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        buffWrite.append(linha);
        buffWrite.close();
	}

    public static void copia(String p1, String p2) throws IOException{
        //copia o 1 para o 2
        String arquivo1 = leitor(p1);
        escritor(p2, arquivo1);
    }

    public static void main(String args []) throws IOException{
        String a1="", a2="";
        System.out.printf("Arquivo 1 (copiado de):");
        Scanner s = new Scanner(System.in);
		a1 = s.nextLine();
        System.out.printf("Arquivo 2 (copiado para):");
        a2 = s.nextLine();
        String path1 = "/home/anamueller/Desktop/Study/VS Codes/POO/Ex16/" + a1 +".txt";
        String path2 = "/home/anamueller/Desktop/Study/VS Codes/POO/Ex16/" + a2 +".txt";
        copia(path1, path2);
    }
}
