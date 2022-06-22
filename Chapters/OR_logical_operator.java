
import java.util.Scanner;
public class OR_logical_operator {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit!!");
        String response=scanner.nextLine();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game!");

        }
        else{
            System.out.println("You are still playing the game! pew pew");
        }

    }
}
