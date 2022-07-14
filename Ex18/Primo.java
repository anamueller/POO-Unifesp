import java.lang.*;
import java.util.Scanner;

public class Primo extends Thread{
    private int comeco;
    private int fim;
    private int nprimos;

    public Primo(int c, int f){
        comeco = c;
        fim = f;
        nprimos = 0;
        start();
    }

    public int ehprimo(int numero){
        int numeros_testes[] = {2,3,5,7,11,13,17,19,23};
        for(int i=0;i<8;i++){
            if(numero == numeros_testes[i]){
                return 1; //numero primo
            }
            if(numero == 1 || numero == 0){
                return 0; //nao sao considerados numeros primos
            }
            if(numero%numeros_testes[i]==0){
                return 0; //numero nao eh primo 
            }
        }
        return 1; //numero eh primo
    }

    public void run(){
        for(int i=comeco; i<fim+1; i++){
            int teste = ehprimo(i);
            if(teste==1){
                nprimos++;
            }
            if(teste==0){
                continue;
            }
        }
        System.out.printf("Total de números primos no intervalo de %d a %d é %d\n", comeco, fim, nprimos);
    }

    public static void main(String args []){
        int com, fim;
        Scanner s = new Scanner(System.in);
        com = s.nextInt();
        fim = s.nextInt();
        s.close();
        Primo ana = new Primo(com,fim);
    }
}