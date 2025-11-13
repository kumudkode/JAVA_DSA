package basic.ConditionalThinking;

public class divisibleby3or5 {
    public static void main(String[] args) {
        int num = 9;
        if(num %3==0 || num %5==0){
            System.out.println("Number is divisible by 3 or 5");
        }
        else{
            System.out.println("Not divisible by either 3 or 5");
        }
       // or this way
        if(num %3 ==0){
            System.out.println("divisible by 3 ");
        }
        else if(num %5==0){
            System.out.println("divisible by 5");
        }


    }
}
