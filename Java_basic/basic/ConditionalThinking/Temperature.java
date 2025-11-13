package basic.ConditionalThinking;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature value:");
        double temp = sc.nextDouble();

        System.out.println("Enter unit (C/F):");
        char unit = sc.next().toUpperCase().charAt(0);

        if (unit == 'C') {   // Celsius logic
            if (temp > 30) System.out.println("Hot");
            else if (temp >= 20) System.out.println("Warm");
            else if (temp >= 10) System.out.println("Cool");
            else System.out.println("Freezing");

        } else if (unit == 'F') {  // Fahrenheit logic
            if (temp > 86) System.out.println("Hot");
            else if (temp >= 68) System.out.println("Warm");
            else if (temp >= 50) System.out.println("Cool");
            else System.out.println("Freezing");

        } else {
            System.out.println("Invalid unit. Use C or F.");
        }
    }
}
