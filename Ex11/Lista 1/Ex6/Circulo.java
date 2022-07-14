public class Circulo extends Figura{
    private double raio;
    private double pie;

    public Circulo(String t, int l, double r, double p){
        super(t, l, 0);
        raio = r;
        pie = p;
    }

    public double calcArea(){
        double a = 2*pie*raio;
        this.area = a;
        return a;
    }

    public void print(Circulo c){
        String s = c.toString();
        System.out.printf("%s", s);
    }

    public static void main(String args []){
        Circulo hen = new Circulo("Círculo", 0, 3, 3.14);
        hen.calcArea();
        hen.print(hen);
    }
}