
public class array2{
    public static void main (String[] args){
        String [][] cars= {
                             {"camaro ","corvette ","silverado"},
                             {"mustang ","ranger ","F-150"},
                             {"ferrari ","lambo ","tesla"}
    
                          };
    
        for(int i=0; i<cars.length;i++){
            System.out.println();
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j]);
    
            }
    
        }
        
    
    
    }
    }