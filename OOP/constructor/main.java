

public class main{
    public static void main(String [] args)
    {
        Human human1=new Human("bro",35,70);
        Human human2=new Human("rick",17,56);

        System.out.println(human1.name+" "+human1.age+" "+human1.weight);
        
        System.out.println(human2.name+" "+human2.age+" "+human2.weight);
           
           human1.drink();
    }
   

   

    
}
