public abstract class Figura{
    double area;
    private String tipo;
    private int qntdlados;

    public Figura(String t, int l, double ar){
        area = ar;
        tipo = t;
        qntdlados = l;
    }

    public abstract double calcArea();

    public double getArea(){
        return area;
    }

    public String toString(){
        return "Figura: " + tipo + "\n" + qntdlados + " lados\n" + "area " + area;
    }
}