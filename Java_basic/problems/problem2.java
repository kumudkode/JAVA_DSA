package problems;

public class problem2 {
    // problem2 ODD even from 9-189;

    public static void main(String[] args) {
        
        // EVEN ODD
         // 1st logic where one is even and another is odd
        // for(int i =9;i<=189;i++){
           
        //     if (i%2==0) {
        //         System.out.println(i +" even");
        //     }
        //     else{
        //         System.out.println(i + " odd");
        //     }
        // }

        // 2nd logic where only even will be print and odd will be escape 
        // for(int i =9;i<=189;i++)
        // {

        //     if (i%2==0) {
        //         System.out.println(i +" even");
        //     }  
        // }
        
        //3rd logic where sum of even number will be print
        // int sum= 0;
        //  for(int i =9;i<=189;i++)
        // {

        //     if (i%2==0) {
        //         System.out.println(i +" even");
        //         sum = sum+i;
        //     }  
           
        // }
        // System.out.println("sum of all even number is: "+ sum  );

        // 4th logic where sum of both even and odd will be print separately
                int evenly= 0;
                int oddly = 0;
                int total = 0;
         for(int i =9;i<=189;i++)
         {

            if (i%2==0) {
                System.out.println(i +" even");
                evenly = evenly+i;
            }  
            else{
               System.out.println(i +" odd");
               oddly = oddly + i; 
            }
           total = evenly + oddly;
         }

        System.out.println("sum of all even numbers are: "+ evenly );
        System.out.println("sum of all odd numbers are: "+ oddly );
        System.out.println("Total of both numbers are: "+ total);

    }


}
