public class RoboSimples extends RoboAbstrato {
    RoboSimples(String n, int px, int py, short d) {
    super(n, px, py, d);
    }

    public void move(int passos) {
        switch (direcaoAtual()){
        case 0:
            moveX(+passos);
            break;
        case 90:    
            moveY(+passos);
            break;
        case 180:
            moveX(-passos);
            break;
        case 270:
            moveY(-passos);
            break;
        }
    }

    public void mudaDirecao(int ang){
        if(ang<45 || ang>=315){
            novaDir(0);
        }
        else if(ang>=45 && ang<135){
            novaDir(90);
        }
        else if(ang>=135 && ang<225){
            novaDir(180);
        }
        else if(ang>=225 && ang<315){
            novaDir(270);
        }
    }
}