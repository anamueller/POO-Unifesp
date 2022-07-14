public abstract class Triangulo extends Figura{

    public Triangulo(String t, int l, double ar){
        super(t,l,ar);
    }

    public abstract double calcArea();

    public void print(Triangulo t){
        String s = t.toString();
        System.out.printf("%s", s);
    }
}