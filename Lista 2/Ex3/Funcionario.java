import java.util.*;

public class Funcionario{
    private String sobreNome;
    private String nome;
    private double salarioHora;
    private int anosNaEmpresa;

    public Funcionario(String sb, String n, double s, int a){
        sobreNome = sb;
        nome = n;
        salarioHora = s;
        anosNaEmpresa = a;
    }

    public String getSobrenome(){
        return sobreNome;
    }

    public String getnome(){
        return nome;
    }

    public double getsalarioHora(){
        return salarioHora;
    }
    
    public int getanosNaEmpresa(){
        return anosNaEmpresa;
    }

    public void setSobrenome(String sb){
        sobreNome = sb;
    }

    public void setnome(String n){
        nome = n;
    }

    public void setsalarioHora(Double s){
        salarioHora = s;
    }

    public void setanosNaEmpresa(int a){
        anosNaEmpresa = a;
    }

    public void imprimi(Funcionario vetor[], int X){
        for(int i=0; i<vetor.length; i++){
            if(vetor[i].anosNaEmpresa >= X){
                System.out.printf("\nFuncionario(a) %s %s\n Salário de %f reais.", vetor[i].nome, vetor[i].sobreNome, vetor[i].salarioHora);
            }
        }
    }

    public static void main(String [] args){
        String n, sb;
        double sa;
        int a, f;
        Scanner s = new Scanner(System.in);
        System.out.printf("Digite a quantidade de funcionario que deseja adicionar.\n");
        f = s.nextInt();
        Funcionario vetor[] = new Funcionario[f];
        for(int i=0; i<f; i++){
            System.out.printf("Digite os anos na empresa, salario, nome e sobrenome do funcionario.\n");
            a = s.nextInt();
            sa = s.nextDouble();
            String extra = s.nextLine();
            n = s.nextLine();
            sb = s.nextLine();
            vetor[i] = new Funcionario(sb, n, sa, a);
        }
        vetor[0].imprimi(vetor, 10);
        s.close();
    }
}