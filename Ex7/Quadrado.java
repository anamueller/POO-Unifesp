import java.util.*;
import java.lang.Math;

public class Quadrado{
    private int lado;
    public Quadrado(){
        lado = 1;
    }
    public void setLado(int l){
        lado = l;
    }
    public void area(){
        int a = lado*lado;
        System.out.printf("\nÁrea do quadrado: %d\n", a);
    }
    public void perimetro(){
        int p = 4*lado;
        System.out.printf("\nPerímetro do quadrado: %d\n", p);
    }
}