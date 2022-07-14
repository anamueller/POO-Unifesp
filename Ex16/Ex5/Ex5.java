import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Ex5 {
	
    public void copiaArquivo (Map<Integer,String> exercicio, String arquivo) throws IOException {

        FileWriter fw = new FileWriter (arquivo);
        BufferedWriter bw = new BufferedWriter(fw);
                
        for (Map.Entry<Integer, String> iteracao : exercicio.entrySet()) {
            int indice = iteracao.getKey();
            String palavra = iteracao.getValue();
            String linha = (palavra + " " + indice);
            bw.write(linha);
            bw.newLine();
        }
        bw.close();
    }
}

