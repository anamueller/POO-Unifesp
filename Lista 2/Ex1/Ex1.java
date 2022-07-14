import java.util.*;
import java.util.Arrays;

public class Ex1{
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int a=1, n=0;
        int[] numeros = new int[100];
        while(a!=0){
            a = s.nextInt();
            numeros[n] = a;
            n++;
        }
        int[] num = new int[n];
        System.arraycopy(numeros, 0, num, 0, n);
        Arrays.sort(num);
        for(int i=1; i<n; i++){
            System.out.printf("%d ", num[i]);
        }
        s.close();
    }
}