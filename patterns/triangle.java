package patterns;

public class triangle {
    public static void main(String[] args) {
        int n = 5;

        // Top half of K
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i + j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Bottom half of K
        for (int i = 1; i < n; i++) {  // Start from 1 to avoid duplicating the middle line
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
