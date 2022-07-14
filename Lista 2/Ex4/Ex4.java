import java.util.*;

public class Ex4 {
    private int n;
    private int[] vetor;

    public Ex4(int num){
        n = num;
        vetor = new int[num];
    }

    public void setNum(int i, int num){
        vetor[i] = num;
    }

    public int getNum(){
        return n;
    }

    public void maior(){
        int max = 0;
        for(int i = 0; i<n; i++){
            if(vetor[i]>max){
                max = vetor[i];
            }
        }
        System.out.printf("O maior número do vetor é %d", max);
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.printf("Digite a quantidade de numeros que deseja adicionar.\n");
        int num = s.nextInt();
        Ex4 vet = new Ex4(num);
        System.out.printf("Digite os numeros a serem adicionados\n");
        for(int i=0; i<num; i++){
            int a = s.nextInt();
            vet.setNum(i, a);
        }
        vet.maior();
    }
}
