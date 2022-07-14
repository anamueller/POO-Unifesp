import java.lang.Math;
import java.util.*;

public class Ex11 {
    int n;
    double vetor[];

    public Ex11(int num){
        n = num;
        vetor = new double[num];
        for(int i=0;i<n;i++){
            double rand = Math.random();
            vetor[i] = rand;
        }
    }

    public void imprimir(){
        for(int i =0; i<n;i++){
            System.out.printf("%f ", vetor[i]);
        }
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.printf("Qual o tamanho do vetor que deseja criar?\n");
        int num = s.nextInt();
        Ex11 ana = new Ex11(num);
        ana.imprimir();
    }
}
