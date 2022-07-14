
public class Carro{
    String marca;
    String modelo;
    String placa;
    int aceleracao;
    String estado;
    Contador vezesAcelerou = new Contador(0);
    Contador vezesFreou = new Contador(0);
    Contador vezesLigou = new Contador(0);
    //construtor
    public Carro(String mar, String mo, String p, int a){
        marca = mar;
        modelo = mo;
        placa = p;
        aceleracao = a;
    }
    //criando os métodos
    public void acelerar(int a, Carro carro){
        if(carro.estado != "Ligado"){
            System.out.println("\nPrimeiro ligue o carro");
        }
        else{
            System.out.format("Acelerando o carro para %dkm/h", a);
            vezesAcelerou.incrementa();
        }
    }
    public void frear (Carro carro){ 
        if(carro.estado != "Ligado"){
            System.out.println("\nPrimeiro ligue o carro");
        }
        else{
            System.out.println("\nFreando o carro");
            vezesFreou.incrementa();
        }
    }
    public void ligar (){
        estado = "Ligado";
        vezesFreou.incrementa();
    }
    public void desligar (){
        estado = "Desligado";
    }
    public void mostrar(Carro c, String nome){
        System.out.printf("\nCaracterísticas do Carro da/o %s\n", nome);
        System.out.printf("Marca: %s \nModelo: %s \nPlaca: %s \nAceleração: %dkm/h \nEstado: %s \n", c.marca, c.modelo, c.placa, c.aceleracao, c.estado);
    }
    public static void main (String args[]){
        //criando primeiro carro
        Carro carro_ana = new Carro("Audi", "A3", "HCQ-1308", 30);
        carro_ana.ligar();
        carro_ana.mostrar(carro_ana, "Ana Clara");
        carro_ana.acelerar(40, carro_ana);
        carro_ana.frear(carro_ana);
        //criando segundo carro
        Carro carro_isa = new Carro("Jeep", "Renegade", "DUR-7780", 60);
        carro_isa.desligar();
        carro_isa.mostrar(carro_isa, "Isadora");
        carro_isa.acelerar(80, carro_isa);
        carro_isa.frear(carro_isa);
        //criando terceiro carro
        Carro carro_hen = new Carro("Mercedes", "C180","ACM-0700", 70);
        carro_hen.ligar();
        carro_hen.mostrar(carro_hen, "Henrique");
        carro_isa.acelerar(120, carro_hen);
        carro_isa.frear(carro_hen);
    }
}