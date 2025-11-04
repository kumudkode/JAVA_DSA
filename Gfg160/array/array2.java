package Gfg160.array;

public class array2 {
    public static void main(String[] args) {
        int a[] ={23,22,45,0};
        int b[] = new int[a.length];

        b[0] = a[a.length - 1];

        for(int i=0;i<a.length - 1;i++)
        {
            b[i+1] =a[i];
        }

        for(int j:b){
            System.out.println(j);
        }
        

    }
}
// public class Main
// {
// 	public static void main(String[] args) {
// int a[]={34,7,6,2,1};
// int j=2;
// reverse(a,0,a.length-1); //1,2,6,7,34
// reverse(a,0,a.length-j-1); //1,2,6-> 6,2,1
// reverse(a,a.length-j,a.length-q); //7,34->34,7
// // output={6,2,1,34,7}
// for(int i=0;i<a.length;i++){
//     System.out.print(a[i]+",");
// }
// }
// static void reverse(int a[],int l, int r){
//     while(l<r){
//         int temp=a[l];
//         a[l]=a[r];
//         a[r]=temp;
//         l++;
//         r--;
        
//     }
// }
// }