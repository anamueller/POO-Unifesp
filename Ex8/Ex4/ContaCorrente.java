import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta{
    private int limite;

    public ContaCorrente(int l, int a, int d){
        super(a, d);
        limite = l;
        tipo = "Corrente";
    }
    
    public int getLimite(){
        return limite;
    }

    public void adiciona(int a){
        this.debita(a);
        double saldo = this.getSaldo();
        int num = this.getNumero();
        if(saldo>limite){
            System.out.printf("Limite da conta corrente %d excedido, carta enviada\n", num);
        }
    }

    public static void main(String args []){
        Conta ana = new ContaCorrente(3000, 6912645, 777);
        ana.debita(500);
        ana.imprime();
        ana.debita(-10);
        ana.credita(250);
        ana.imprime();
    }
}