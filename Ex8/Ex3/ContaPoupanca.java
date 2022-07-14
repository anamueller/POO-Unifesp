import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta{
    private int juros;

    public ContaPoupanca(int j, int a){
        super(a);
        juros = j;
        tipo = "Poupança";
    }

    public int getJuros(){
        return juros;
    }

    public void adiciona(int j){
        this.credita(j);
    }

    public static void main(String args []){
        Conta ana = new ContaPoupanca(5, 6912645);
        ana.debita(1000);
        ana.imprime();
        ana.debita(10);
        ana.credita(-250);
        ana.imprime();
        ana.credita(200);
        ana.imprime();
    }
}