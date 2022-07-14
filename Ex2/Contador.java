

public class Contador{
    private int cont;
    public Contador(int c){ //valor inicial com qualquer numero desejado
        cont = c;
    }
    public int getcont(){ //valor atual do contador
        return cont;
    }
    public void incrementa_qualquer(int c){ //incrementar com qualquer valor
        cont = cont + c;
    }
    public void incrementa(){ //incrementar com 1 unidade
        cont = cont + 1;
    }
    public void decrementa_qualquer(int c){ //decrementar com qualquer valor
        cont = cont - c;
    }
    public void decrementa(){ //decrementar com 1 unidade
        cont = cont - 1;
    }
    public void visualiza(){ //visualizar o contador
        System.out.printf("\nContador = %d\n", cont);
    }
    public static void main(String args[]){
        Contador cana = new Contador(10);
        cana.visualiza();
        cana.incrementa();
        cana.incrementa_qualquer(23);
        cana.visualiza();
        cana.decrementa();
        cana.decrementa_qualquer(9);
        cana.visualiza();
    }
}