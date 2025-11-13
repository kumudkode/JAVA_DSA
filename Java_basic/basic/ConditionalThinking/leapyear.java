package basic.ConditionalThinking;

public class leapyear {
    public static void main(String[] args) {
    int year = 2002;
    if(year%100 ==0 || year%4 ==0){
      System.out.println("Entered Year is Leap year");
    }
    else{
        System.out.println("Year is not leap year");
    }

    }
}
