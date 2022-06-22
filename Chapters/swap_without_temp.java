public class swap_without_temp {
    public static void main(String [] args){
        int a=10;
        int b=20;
        System.out.println("before Swapping");
    System.out.println("a: "+a);
    System.out.println("b: "+b);
    a=a-b;
    b=a+b;
    a=b-a;
    System.out.println("After Swapping");
    System.out.println("a: "+a);
    System.out.println("b: "+b);

    }

}
