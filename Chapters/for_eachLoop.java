import java.util.ArrayList;
public class for_eachLoop {
    public static void main(String[] args){

        //for-each = traversing technique to iterate through the elements in an array/collection
        //less steps,more readable
        //less flexible


        //String[] animals={"cat","dog","rat","bird"};

        ArrayList<String> animals=new ArrayList<String>();
        animals.add("dog");
        animals.add("rat");
        animals.add("cat");
        animals.add("bird");

        for(String i:animals){
            System.out.println(i);

        }
    }
}
