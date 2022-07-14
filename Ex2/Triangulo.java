public class Triangulo{
    private int base, altura, l1, l2, l3; //tamanhos dos lados do triangulo, qual a base e altura
    private int ang_um, ang_dois, ang_tres; //valores dos angulos do traingulo
    private String tipo; //retangulo, equilatero, isossceles, escaleno, acutangulo, obtusangulo
    public void area(){
        int area;
        area = (base*altura)/2;
        System.out.format("A área é: %d\n", area);
    }
    public void mostra(){
        System.out.println("\nAtributos do triângulo:");
        System.out.printf("Base: %d \nAltura: %d \nLados: %d, %d, %d \nÂngulos: %d, %d, %d \nTipo: %s\n", base, altura, l1, l2, l3, ang_um, ang_dois, ang_tres, tipo);
    }
    public Triangulo(){
        base = 10;
        altura = 15;
        l1 = 10;
        l2 = 4;
        l3 = 5;
        ang_um = 45;
        ang_dois = 45;
        ang_tres = 90;
        tipo = "Retangulo";
    }
    public Triangulo(int b, int a, int la1, int la2, int la3, int a1, int a2, int a3, String t){
        base = b;
        altura = a;
        l1 = la1;
        l2 = la2;
        l3 = la3;
        ang_um = a1;
        ang_dois = a2;
        ang_tres = a3;
        tipo = t;
    }
    public int getbase(){
        return base;
    }
    public int getaltura(){
        return altura;
    }
    public int getlado1(){
        return l1;
    }
    public int getlado2(){
        return l2;
    }
    public int getlado3(){
        return l3;
    }
    public int getangulo1(){
        return ang_um;
    }
    public int getangulo2(){
        return ang_dois;
    }
    public int getangulo3(){
        return ang_tres;
    }
    public String gettipo(){
        return tipo;
    }
    public void setbase(int x){
        base = x;
    }
    public void setaltura(int x){
        altura = x;
    }
    public void setlado1(int x){
        l1 = x;
    }
    public void setlado2(int x){
        l2 = x;
    }
    public void setlado3(int x){
        l3 = x;
    }
    public void setangulo1(int x){
        ang_um = x;
    }
    public void setangulo2(int x){
        ang_dois = x;
    }
    public void setangulo3(int x){
        ang_tres = x;
    }
    public void settipo(String x){
       tipo = x;
    }
    public static void main(String args[]){
        int alt;
        Triangulo tri_da_ana = new Triangulo();
        tri_da_ana.setbase(20);
        tri_da_ana.setaltura(15);
        tri_da_ana.settipo("Equilátero");
        tri_da_ana.area();
        String type = tri_da_ana.gettipo();
        System.out.printf("%s", type);
        tri_da_ana.mostra();
        Triangulo tri_do_hen = new Triangulo(15, 36, 15, 36, 39, 90, 67, 23,"Retângulo");
        tri_do_hen.mostra();
        tri_do_hen.area();
    }
}