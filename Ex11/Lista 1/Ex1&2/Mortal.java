public abstract class Mortal{
    private boolean vivo;
    
    public Mortal(){
        vivo = true;
    }

    public boolean isVivo(){
        return vivo;
    }

    public void setVivo(boolean x){
        vivo = x;
    }

    public abstract void mata();
}