import java.util.Scanner;

public class JavaStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a) Declare variables
        int c, thisIsAVariable, q76354, number;

        // b) Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        
        // c) Read an integer and store in variable value
        int value = input.nextInt();

        // d) Print "This is a Java program" on one line
        System.out.println("This is a Java program");

        // e) Print "This is a Java program" on two lines
        System.out.printf("%s%n%s%n", "This is a Java", "program");

        // f) If number is not equal to 7, print a message
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if (number != 7) System.out.println("The variable number is not equal to 7");
    }
}
