public class RoboABateria extends RoboAbstrato {
    private long energia;

    RoboABateria(String n, int px, int py, short d, long e) {
        super(n, px, py, d);
        energia = e;
    }

    public void move(int passos) {
        long energiaASerGasta;
        if (energiaASerGasta <= energia) {
            switch (direcaoAtual()) {
            case 0:
            moveX(+passos);
                break;
            case 45:
                moveX(+passos);
                moveY(+passos);
                energiaASerGasta = passos * 14;
                break;
            case 90:
                moveY(+passos);
                energiaASerGasta = passos * 10;
                break;
            case 135:
                moveY(+passos);
                moveX(-passos);
                energiaASerGasta = passos * 14;
                break;
            case 180:
                moveX(-passos);
                energiaASerGasta = passos * 10;
                break;
            case 225:
                moveX(-passos);
                moveY(-passos);
                energiaASerGasta = passos * 14;
                break;
            case 270:
                moveY(-passos);
                energiaASerGasta = passos * 10;
                break;
            case 315:
                moveY(-passos);
                moveX(+passos);
                energiaASerGasta = passos * 14;
                break;
            }
        energia -= energiaASerGasta;
        }
    }

    public String toString() {
        String resultado = super.toString() + "\n";
        resultado = resultado + "Energia do robô:" + energia;
        return resultado;
    }
}