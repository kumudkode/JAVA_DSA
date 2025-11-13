package basic.ConditionalThinking;

public class largest {
    public static void main(String[] args) {
int num1 = 22;
int num2 = 33;
int num3 = 55;

if (num1 == num2 && num2 == num3) {
    System.out.println("All numbers are equal");
}
else if (num1 >= num2 && num1 >= num3) {
    System.out.println("num1 is largest");
}
else if (num2 >= num1 && num2 >= num3) {
    System.out.println("num2 is largest");
}
else {
    System.out.println("num3 is largest");
}
// 2nd way 

int largest = Math.max(num1, Math.max(num2, num3));

if (largest == num1) {
    System.out.println("num1 is largest");
} else if (largest == num2) {
    System.out.println("num2 is largest");
} else {
    System.out.println("num3 is largest");
}

// 3rd ways using array
   
        int[] nums = {22, 33, 55};

        int largesty = nums[0];

        for (int n : nums) {
            if (n > largesty) {
                largesty = n;
            }
        }

        System.out.println("Largest number is: " + largest);
    }


    }
