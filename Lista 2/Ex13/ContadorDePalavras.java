public class ContadorDePalavras {
    private String palavra;
    private int n;
    private int tam;

    public ContadorDePalavras(int T){
        ContadorDePalavras words[] = new ContadorDePalavras(T);
        n = 0;
        tam = T;
    }

    public void adicionar(String p, int pos){
        int bol;
        for(int i=0; i<tam;i++){
            if(p == words[i].palavra){
                words[i].n++;
                bol = 1;
            }
        }
        if(bol!= 1){
            words[pos].palavra = p;
        }
    }

    public void getNum(String p){
        for(int i=0; i<=tam;i++){
            if(p == words[i].palavra){
                System.out.printf("%d", palavras[i].n);
            }
        }
    }
}
