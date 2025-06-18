 
public class array {
    void pushZerosToEnd(int[] arr) {
        // code here
        int[] temp = new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
               temp[count]=arr[i];
               count=count+1;
            }
            
        }
        for(int j=count;j<arr.length;j++)
        {
            temp[j]=0;
        }
        
    }
}