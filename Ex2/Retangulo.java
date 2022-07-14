public class Retangulo{
    private int base, lado;
    public Retangulo(int b, int l){
        base = b;
        lado = l;
    }
    public void area(){
        int a;
        a = base*lado;
        System.out.printf("Área do retângulo: %d\n", a);
    }   
    public void perimetro(){
        int p;
        p = 2*base+2*lado;
        System.out.printf("Perímetro do retângulo: %d\n", p);
    }
    public void mostrar(){
        System.out.printf("As dimesões do retângulo são: %d e %d\n", base, lado);
    }
    public void relacao(){
        System.out.printf("A relação entre base e altura é %d/%d\n", base, lado);
    }
    public void quad(){
        if(base==lado){
            System.out.printf("O retângulo é um quadrado.\n");
        }
        else{
            System.out.printf("O retângulo não é um quadrado.\n");
        }
    }
    public void setbase(int b){
        base = b;
    }
    public void setlado(int l){
        lado = l;
    }
    public int getbase(){
        return base;
    }
    public int getlado(){
        return lado;
    }
    public static void main(String args[]){
        Retangulo hen = new Retangulo(17, 15);
        hen.area();
        hen.perimetro();
        hen.mostrar();
        hen.relacao();
        hen.quad();
        hen.setlado(17);
        hen.quad();
        hen.setbase(18);
        hen.quad();
    }
}