import java.util.ArrayList;

public class arrayLIST {
    public static void main(String[] args){

     ArrayList<String>food = new ArrayList<String>();
     food.add("burger");
     food.add("pizza");
     food.add("maggie");

     food.set(0, "sushi");
     food.remove(2);
     food.clear();

     for(int i=0; i<food.size();i++){
        System.out.println(food.get(i));

     }

    }
}
