import java.util.Random;
class DiceRoller{
    Random random;
    int number;
    DiceRoller()
    {
        random=new Random();
       roll();
    }

    void roll()
    {
        number=random.nextInt(6)+1;
        System.out.println(number);

    }
}
public class variable_scope {
    public static void main (String [] args){

        DiceRoller diceRoller = new DiceRoller();
    }
}
