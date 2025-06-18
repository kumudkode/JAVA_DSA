public class array2 {
    public static void main(String[] args) {
        int c = 0;
        int arr[] = { 1, 0, 2, 0, 3 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[c] = arr[i];
                c++;
            }
        }
        for (int i = c; i < arr.length; i++) {
          arr[i]=0;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        
    }
}