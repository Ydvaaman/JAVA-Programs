class Car{
    String make="Chevorlet";
    String model="Corvett";
    int year=2012;
    String color="White";

    public String toString(){

        //String myString=make+"\n"+model+"\n"+year+"\n"+color;
        return make+"\n"+model+"\n"+year+"\n"+color;

    }

}

public class toString {
    public static void main(String main[]){

         Car car = new Car();
         //System.out.println(car.toString());
         System.err.println(car);




    }
}
