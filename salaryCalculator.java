import java.util.Scanner;
public class salaryCalculator() {
public static void main(String[] args){
	
    Scanner input = new Scanner(System.in);
    for (int i = 1; i <= 3; i++) {
        System.out.print("Enter hours worked for employee " + i + ": ");
        int hours = input.nextInt();
        System.out.print("Enter hourly rate: ");
        double rate = input.nextDouble();
        double pay = (hours <= 40) ? (hours * rate) : (40 * rate + (hours - 40) * rate * 1.5);
        System.out.println("Gross pay: $" + pay);
    }
}
}