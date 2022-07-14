public class Quadrado extends Retangulo{

     public Quadrado(String t, int l, double ar, double lado){
        super(t, l, 0, lado, lado);
    }

    public void print(Quadrado q){
        String s = q.toString();
        System.out.printf("%s", s);
    }

    public static void main(String args []){
        Quadrado ana = new Quadrado("Quadrado", 4, 0, 5);
        ana.calcArea();
        ana.print(ana);
    }
}