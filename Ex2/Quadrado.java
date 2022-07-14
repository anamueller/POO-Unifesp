import java.lang.Math;
public class Quadrado{
    private int lado;
    private int area;
    public void area(){
        int a;
        a = lado*lado;
        System.out.printf("\nA área do quadrado é: %d\n", a);
        area = a;
    }
    public Quadrado(int l){
        lado = l;
    }
    public void setlado(int l){
        lado = l;
    }
    public int getlado(){
        return lado;
    }
    public int getarea(){
        return area;
    }
    public static void main(String args[]){
        int soma = 0;
        for(int i=0; i<10; i++){
            int num = (int)(Math.random()*10);
            Quadrado q = new Quadrado(num);
            System.out.printf("Lado gerado para o %d° quadrado: %d", i+1, num);
            q.area();
            int a = q.getarea();
            soma = soma + a;
        }
        System.out.printf("\nA soma das áreas dos quadrados é %d\n", soma);
    }
}