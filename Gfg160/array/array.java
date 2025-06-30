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
       
       a[0]=2;
       a[1]=3;
       a[2]=4;

     // if we not declare anything then output of an array will be 0

       for(int i = 0; i<a.length;i++)
       {
        System.out.println(a[i]);
       
     
    }
}
