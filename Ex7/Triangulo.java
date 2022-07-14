import java.util.*;
import java.lang.Math;

public class Triangulo{
    private int a, b, c;
    public Triangulo(){
        a = 1;
        b = 1;
        c = 1;
    }
    public void setLados(int l1, int l2, int l3){
        a = l1;
        b = l2;
        c = l3;
    }
    public void area(){
        double p, semiarea, area;
        p = (a+b+c)/2;
        semiarea = p*(p-a)*(p-b)*(p-c);
        if(semiarea<0){
            System.err.println("Erro: tentativa de raiz quadrada sobre número negativo");
        }
        else{
            area = Math.ceil(Math.sqrt(semiarea));
            System.out.printf("\nÁrea do triângulo: %f", area);
        }
    }
    public void perimetro(){
        int p = a+b+c;
        System.out.printf("\nPerímetro do triângulo: %d\n", p);
    }
    public void tipo(){
        if(a==b && b==c){
            System.out.printf("Triângulo é equílatero.\n");
        }
        else if(a==b || b==c || a==c){
            System.out.printf("Triângulo é isósceles.\n");
        }
        else{
            System.out.printf("Triângulo é escaleno.\n");
        }
    }
    public static void main(String args []){
        System.out.printf("Digite o número do que deseja criar: \n1 - Quadrado \n2 - Triângulo\n");
        int ler;
        Scanner hen = new Scanner(System.in);
        ler = hen.nextInt();
        if(ler == 1){
            System.out.printf("\nVocê escolheu a opção Quadrado, digite o tamanho do lado:\n");
            int lado;
            Quadrado quadrado = new Quadrado();
            quadrado.setLado(hen.nextInt());
            quadrado.area();
            quadrado.perimetro();
        }
        else if(ler == 2){
            System.out.printf("Você escolheu a opção Triângulo, digite o tamanho dos 3 lados, no formato \nx\ny\nz\n");
            int a, b ,c;
            a = hen.nextInt();
            b = hen.nextInt();
            c = hen.nextInt();
            Triangulo tri = new Triangulo();
            tri.setLados(a,b,c);
            tri.area();
            tri.perimetro();
            tri.tipo();
        }
        else{
            System.err.println("Erro: opção inválida");
        }
    }
}