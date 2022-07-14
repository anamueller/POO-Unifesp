public class Banco{
    private Conta contas[];
    private int tam;

    public Banco(int tamanho){
        contas = new Conta[tamanho];
        tam = tamanho;        
    }

    public void abre(Conta c, int posicao){
        contas[posicao] = c;
    }

    public void fecha(int numero){
        Conta gen = new ContaCorrente(0, 0000000, 0);
        int n;
        for(int i=0;i<tam;i++){
            n = contas[i].getNumero();
            if(n == numero){
                contas[i] = gen;
            }
        } 
    }

    public void mostra(){
        for(int i=0; i<tam; i++){
            if(contas[i].getNumero()==0){
                System.out.printf("Conta exlcuída\n");
            }
            else{
                contas[i].imprime();
            }
        }
    }

    public void atualiza(int add){
        for(int i=0; i<tam; i++){
            String t = contas[i].getTipo();
            if(contas[i].getNumero()==0){
                System.out.printf("Conta exlcuída\n");
            }
            else{
                if(t == "Corrente"){
                    contas[i].adiciona(add);
                }
                else if(t == "Poupanca"){
                    contas[i].adiciona(add);
                }
            }
        }
    }

    public static void main(String args []){
        Conta ana = new ContaPoupanca(5, 6912645, 1000);
        ana.debita(50);
        Conta clara = new ContaCorrente(300, 9067865, 777);
        clara.debita(100);
        Banco henrique = new Banco(2);
        henrique.abre(ana, 0);
        henrique.abre(clara, 1);
        henrique.fecha(9067865);
        henrique.mostra();
        henrique.atualiza(400);
    }
}