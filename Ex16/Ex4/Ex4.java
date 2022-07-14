import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex4 {

        private Map<Integer,String> exercicio = new HashMap<>();

        public void armazena (String arquivo) throws IOException {

                Scanner sc = new Scanner (new File(arquivo));

                while(sc.hasNextLine()) {
                        String linha = sc.nextLine();

                        Scanner separar = new Scanner(linha);
                        separar.useDelimiter(" ");

                        String palavra = separar.next();
                        int indice = separar.nextInt();

                        this.exercicio.put(indice, palavra);

                        separar.close();
                }
       
                sc.close();
        
        }

}