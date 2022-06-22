import java.util.Scanner;
public class while_loop {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        String name="";

        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name=scanner.nextLine();

        }
        System.out.println("hello "+name);

    }
    
}
