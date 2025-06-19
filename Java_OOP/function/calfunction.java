package Java_OOP.function;

public class calfunction {

    public static void add(){
        int a = 10;
        int b = 10;
        int sum = a+b;
        System.out.println("sum"+" "+sum);
    }
    public static void subs(int a, int b){
     int sub;
     sub = a-b;
     System.out.println("subs"+" "+sub);
    }
    public static int mul(){
        int a = 10;
        int b = 20;
        int mult = a*b;
        System.out.println("mul"+" "+mult);
        return 0;

    }
    
    public static int div(int a, int b){
        int div = a/b;
        System.out.println("div"+" "+div);
        return 0;
    }
   
    public static void main(String[] args) {
        add();
        subs(2,4);
        mul();
        div(2, 4);

        
    }
   
    }
