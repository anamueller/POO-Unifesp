public class Losango extends Paralelogramo{
    private double lado;

    public Losango(String t, int l, double ar, double la){
        super(t, l, 0);
        lado = la;
    }

    public double calcArea(){
        double D = (lado*1.732)/2;
        double a = (lado*D)/2;
        this.area = a;
        return a;
    }

    public static void main(String args []){
        Paralelogramo hen = new Losango("Losango", 4, 0, 10);
        hen.calcArea();
        hen.print(hen);
    }
}