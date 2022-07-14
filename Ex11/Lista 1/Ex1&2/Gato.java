public class Gato extends Mortal{
    private int mortes;

    Gato(){
        super();
        mortes = 0;
    }

    public void estado(){
        boolean estado = this.isVivo();
        if(estado == true){
            System.out.printf("O gato está vivo e a função mata foi chamada %d vezes\n", mortes);
        }
        else if(estado == false){
            System.out.printf("O gato está morto.\n");
        }
    }

    public void mata(){
        mortes = mortes + 1;
        if(mortes == 7){
            this.setVivo(false);
        }
    }

    public static void main(String args []){
        Gato bento = new Gato();
        bento.estado();
        bento.mata();
        bento.mata();
        bento.mata();
        bento.mata();
        bento.estado();
        bento.mata();
        bento.mata();
        bento.mata();
        bento.estado();
    }
}