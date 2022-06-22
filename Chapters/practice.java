 class Human{
    String name;
    double weight;
    int age;
    Human(String name,double weight,int age)
     {
        this.name=name;
        this.weight=weight;
        this.age=age;

     }
    
}
public class practice{
public static void main (String[] args){
  
Human human=new Human("aman", 50.0, 34);

System.out.println(human.name+" "+human.weight+" "+human.age);

}

}
