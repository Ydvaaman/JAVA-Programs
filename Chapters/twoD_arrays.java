public class twoD_arrays {
    public static void main(String[] args) 
    {
         String [][] cars= new String[3][3];

         cars[0][0]="camaro";
         cars[0][1]="corvette";
         cars[0][2]="silverado";
         cars[1][0]="mustang";
         cars[1][1]="ranger";
         cars[1][2]="F-150";
         cars[2][0]="ferrari";
         cars[2][1]="lambo";
         cars[2][2]="tesla";

         for(int i=0; i<cars.length;i++)
         {
            System.out.println();
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j]+" ");

            }
            



         }




    }
}
