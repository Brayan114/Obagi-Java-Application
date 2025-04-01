import java.util.Scanner;
public class salesCommission()  {
public static void main(String[] args){
	
    Scanner input = new Scanner(System.in);
    System.out.print("Enter total sales: ");
    double sales = input.nextDouble();
    double earnings = 200 + (0.09 * sales);
    System.out.println("Earnings: $" + earnings);
}
}