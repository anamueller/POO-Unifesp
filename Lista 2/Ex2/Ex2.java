import java.util.*;
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args){
        double soma=0;
        int n;
        Scanner s = new Scanner(System.in);
        System.out.printf("Digite o tamanho do vetor que deseja criar: ");
        n = s.nextInt();
        double[] numeros = new double[n];
        System.out.printf("Digite os números do vetor.\n");
        for(int i = 0; i<n; i++){
            double a = s.nextDouble();
            numeros[i] = a;
            soma = soma + numeros[i];
        }
        double media = soma/n;
        System.out.printf("A média do vetor é %f", media);
        s.close();
    }
}
