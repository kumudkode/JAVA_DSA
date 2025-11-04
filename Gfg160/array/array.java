package Gfg160.array;

public class array {
    public static void main(String[] args) {
        // lets learn Array in java
        // 1st way
        // int a[];
        // a = new int[3];
        // a[0]= 1;
        // a[1]= 2;
        // a[2]= 20;
        // //1,2,20

        // //2nd way
        // int b[] = new int[3];
        // b[1]=12; b[2]=23; b[3]=34; b[4]=32; b[5]= 39;
        
        // System.out.println("Enter Your number");
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        // int d = sc.nextInt();
        // System.out.println("your name");
        // String name =sc.next();
       
    //    int a[], b;
    int []a,b;
       a = new int[4];
    //    b = 5;
       b = new int[2];
       
       a[0]=9;
       a[1]=8;
       a[2]=43;

     // if we not declare anything then output of an array will be 0

       for(int i = 0; i<a.length;i++)
       {
        i= i+1;
        System.out.println(a[i]);
       
     
    }
    // int d = 200;
    // Integer e = d; //autoboxing
    // System.out.println(e);

    // Integer f = 2030;
    // int s= f; //unboxing
    // System.out.println(s);

}
}