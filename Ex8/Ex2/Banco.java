public class Banco{
    private Conta contas[];
    private int tam;

    public Banco(int tamanho){
        contas = new Conta[tamanho];
        tam = tamanho;        
    }

    public void adiciona(Conta c, int posicao){
        contas[posicao] = c;
    }

    public void mostra(int tamanho){
        for(int i=0; i<tamanho; i++){
            contas[i].imprime();
        }
    }

    public static void main(String args []){
        Conta ana = new ContaPoupanca(5, 6912645);
        ana.debita(250);
        Conta clara = new ContaCorrente(3000, 6912646);
        clara.debita(10000);
        Banco henrique = new Banco(2);
        henrique.adiciona(ana, 0);
        henrique.adiciona(clara, 1);
        henrique.mostra(2);
    }
}