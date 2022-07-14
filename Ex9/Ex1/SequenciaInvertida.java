public class SequenciaInvertida implements CharSequence{
    private String seq;

    public char charAt(int index){
        return seq.charAt(index);
    }
    public int length(){
        return seq.length();
    }
    public java.lang.CharSequence subSequence(int start, int end){
        return seq.subSequence(start, end);
    }
    public String toString(){
        return seq;
    }
    public SequenciaInvertida(String s){
        char[] carac = s.toCharArray();
        int l = s.length();
        char[] invertido = new char[l];
        for(int i=0; i<s.length(); i++){
            invertido[l-1] = carac[i];
            l--;
        }
        seq = new String(invertido);
        System.out.printf("Invertendo a sequência %s ficamos com %s", s, seq);
    }
    public static void main(String[] args){
        SequenciaInvertida ana = new SequenciaInvertida("Ana ama Henrique");
        System.out.printf("\nCaracter escolhido %s", ana.charAt(4));
        System.out.printf("\nO tamanho da sequência é %d caracteres", ana.length());
        System.out.printf("\nA subsequência de 3 a 8 é %s", ana.subSequence(3,8));
        System.out.printf("\nString: %s", ana.toString());
    }
}