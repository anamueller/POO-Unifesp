import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta{
    private int limite;

    public ContaCorrente(int l, int a){
        super(a);
        limite = l;
        tipo = "Corrente";
    }

    public int getLimite(){
        return limite;
    }

    public static void main(String args []){
        Conta ana = new ContaCorrente(3000, 6912645);
        ana.debita(500);
        ana.imprime();
        ana.debita(-10);
        ana.credita(250);
        ana.imprime();
    }
}