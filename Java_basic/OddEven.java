import java.util.Scanner;

public class OddEven {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Lets Print Odd and Even");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // here % is a modulo operator it check remainder

        // 1st way
        // if(n%2==0){
        // System.out.println("number is even");
        // }
        // else
        // {
        // System.out.println("number is odd");
        // }

        // 2nd way
        // for (n = 0; n <= 12; n++) {

        //     if (n % 2 == 0) {
        //         System.out.println("\nEven " + n);
        //     } else {
        //         System.out.println("\nOdd " + n);
        //     }

        // }
        // 3rd way
        // if(n%2!=0)
        // {
        //     System.out.println("Odd");
        // }
        // else{
        //     System.out.println("Even");
        // }
        // 4th way print only even from 17-53
        for(int i=17;i<=53;i++)
        { if(i%2==0){
            System.out.println(i+" even");
        }
        }
        // 5th way from -53 to 53 here we have to give starting number divisible by 2

        for(int a=-52;a<=53; a+=2)
        {
        System.out.println(a+" even");
        }
    }
}
