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

    public void mostra(){
        for(int i=0; i<tam; i++){
            contas[i].imprime();
        }
    }

    public void atualiza(int add){
        for(int i=0; i<tam; i++){
            String t = contas[i].getTipo();
            if(t == "Corrente"){
                contas[i].adiciona(add);
            }
            else if(t == "Poupanca"){
                contas[i].adiciona(add);
            }
        }
    }

    public static void main(String args []){
        Conta ana = new ContaPoupanca(5, 6912645);
        ana.debita(50);
        Conta clara = new ContaCorrente(300, 9067865);
        clara.debita(100);
        Banco henrique = new Banco(2);
        henrique.adiciona(ana, 0);
        henrique.adiciona(clara, 1);
        henrique.mostra();
        henrique.atualiza(400);
    }
}