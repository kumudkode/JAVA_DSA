package problems;

public class problem1 {
    public static void main(String[] args) {

        //problem1: ODD EVEN logic

        System.out.println("Enter a valid number");

        java.util.Scanner s = new java.util.Scanner(System.in) ;

       int number = s.nextInt(); // we directly can not do operations on object so we need to store it and make it integer value

        if(number % 2 == 0){
         System.out.println(number +" Number is Even");
        }
        else{
            System.out.println(number + " Number is Odd");
        }

    // -----------------------------------------------------------------------------------------------
    //Basic odd even Logic

    // int a = 22;
    // if (a % 2 ==0) {
    //     System.out.println(a + " Even");
    // }
    // else
    // System.out.println(a+ " Odd");

    }
}
