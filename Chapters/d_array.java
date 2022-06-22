import java.util.*;
public class d_array {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> groceryList=new ArrayList();

          ArrayList<String>bakeryList=new ArrayList();
          bakeryList.add("pasta");
          bakeryList.add("garlic bread");
          bakeryList.add("donuts"); 
          
          
          ArrayList<String>produceList=new ArrayList();
          produceList.add("tomatoes");
          produceList.add("zucchini");
          produceList.add("pepper"); 

          
          ArrayList<String>drinksList=new ArrayList();
          drinksList.add("soda");
          drinksList.add("coffee");
          
          groceryList.add(bakeryList);
          groceryList.add(produceList);
          groceryList.add(drinksList);

          System.out.println(groceryList);
    }
}
