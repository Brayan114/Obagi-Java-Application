import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        int r = input.nextInt();
        
        System.out.printf("Diameter: %d%n", (2 * r));
        System.out.printf("Circumference: %.2f%n", (2 * Math.PI * r));
        System.out.printf("Area: %.2f%n", (Math.PI * r * r));
    }
}
