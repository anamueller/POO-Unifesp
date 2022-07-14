public abstract class Paralelogramo extends Figura{

    public Paralelogramo(String t, int l, double ar){
        super(t, l, 0);
    }

    public abstract double calcArea();

    public void print(Paralelogramo p){
        String s = p.toString();
        System.out.printf("%s", s);
    }
}