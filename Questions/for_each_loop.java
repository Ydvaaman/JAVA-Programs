

public class for_each_loop {
    public static void main(String[] args){

        int [] numbers={3,4,-5,5,6,2};
        int sum=0;

        for(int i:numbers){
            sum+=i;

        }
        System.out.println("sum "+sum);
    }

    
}
