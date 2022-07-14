public class Reta implements Relacao{
    int p1, p2;
    int d = p2-p1;

    public boolean maiorQue(Object b){
        Reta r = (Reta)b;
        if(r.d<d){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean menorQue(Object b){
        Reta r = (Reta)b;
        if(r.d>d){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean igualA(Object b){
        Reta r = (Reta)b;
        if(r.d==d){
            return true;
        }
        else{
            return false;
        }
    }
}