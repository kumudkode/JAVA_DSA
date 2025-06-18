package patterns;

public class character {
        public static void main(String[] args) {
            int rows = 11;
    
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j <= rows / 2; j++) {
                    if (j == 0 || j == rows / 2 - i || j == i - rows / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    

