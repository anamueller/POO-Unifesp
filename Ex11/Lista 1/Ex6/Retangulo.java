public abstract class Retangulo extends Figura{
    private double base;
    private double altura;

    public Retangulo(String t, int l, double ar, double b, double alt){
        super(t, l, 0);
        base = b;
        altura = alt;
    }

    public double calcArea(){
        double a = base*altura;
        this.area = a;
        return a;
    }
}