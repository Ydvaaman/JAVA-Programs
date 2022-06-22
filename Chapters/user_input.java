import java.util.Scanner;

public class user_input {
    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);
        System.out.println("what is your name?");
        String name=scanner.nextLine();
        System.out.println("hello "+name);
        
        System.out.println("How old are you?");
        int age=scanner.nextInt();
        System.out.println("You are "+age+" years old");

        scanner.nextLine();
        
        System.out.println("what is your favourite food?");
        String food=scanner.nextLine();
        System.out.println("Your favourite food is "+food);

    }
}
