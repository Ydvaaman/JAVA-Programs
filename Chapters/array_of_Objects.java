class Food{
    String name;
    Food(String name){
        this.name=name;

    }
}
public class array_of_Objects {
    public static void main(String [] args){
        //Food[] referigerator= new Food[3];
     
        Food food1= new Food("Pizza");
        Food food2= new Food("Hamburger");
        Food food3= new Food("Hotdog");
        
        Food[] referigerator={food1,food2,food3};
        //referigerator[0]=food1;
       //referigerator[1]=food2;
       //referigerator[2]=food3;

        System.out.println( referigerator[0].name);
        System.out.println( referigerator[1].name);
        System.out.println( referigerator[2].name);
    }
}
