public abstract class Conta{
    private double saldo;
    private int numero;
    public String tipo;
    private int dividendos;
    public Conta(int a, int d){
        saldo = 0.0;
        numero = a;
        dividendos = d;
    }
    public void debita(double quantia){
        if(quantia>0){
            saldo += quantia;
        }
        else{
            System.err.println("Conta.deposita(...)" + "não se pode depositar uma quantia negativa.");
        }
    }
    public void credita(double quantia){
        if(quantia>0){
            saldo -= quantia;
        }
        else{
            System.err.println("Conta.saca(...)" + "não se pode sacar uma quantia negativa."); 
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
    public int getNumero(){
        return numero;
    }

    public String getTipo(){
        return tipo;
    }
    public void imprime(){
        System.out.println("Conta " + tipo + " " + numero + "\n" + "saldo = " + saldo);
    }

    public abstract void adiciona(int a);
}