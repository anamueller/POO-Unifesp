import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {

    public void copiaArquivo (String arquivo) throws IOException {

        Scanner sc = new Scanner (new File(arquivo));

        while(sc.hasNextLine()) {
            String linha = sc.nextLine();
            
            Scanner separar = new Scanner(linha);
            separar.useDelimiter(" ");
            
            String palavra = separar.next();
            int indice = separar.nextInt();
            
            separar.close();
        }
        sc.close();
    }

}