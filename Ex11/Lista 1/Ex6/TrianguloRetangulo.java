public class TrianguloRetangulo extends Triangulo{
    private double cateto1;
    private double cateto2;
    private double hipotenusa;

    public TrianguloRetangulo(String t, int l, double ar, double c1, double c2, double h){
        super(t,l,ar);
        cateto1 = c1;
        cateto2 = c2;
        hipotenusa = h;
    }

    public double calcArea(){
        double a = cateto1*cateto2;
        this.area = a;
        return a;
    }

    public static void main(String args []){
        TrianguloRetangulo hen = new TrianguloRetangulo("Triângulo Retângulo", 3, 0, 3, 4, 5);
        hen.calcArea();
        hen.print(hen);
    }
}