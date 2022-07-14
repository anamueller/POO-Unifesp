import java.util.*;

public class CatsAndDogs {
    public static void main(String[] args){
        List<Cat> cats = new ArrayList<Cat>();
        for(int i = 0; i < 7; i++){
            cats.add(new Cat(i));
        }
        for(int i = 0; i < cats.size(); i++){
            ((Cat)cats.get(i)).id();
        }
    }
}