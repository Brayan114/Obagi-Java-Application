import java.util.Scanner;
public class gasMileage() {
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int miles, gallons;
    double totalMiles = 0, totalGallons = 0;
    while (true) {
        System.out.print("Enter miles (-1 to stop): ");
        miles = input.nextInt();
        if (miles == -1) break;
        System.out.print("Enter gallons: ");
        gallons = input.nextInt();
        System.out.println("Miles per gallon: " + (double) miles / gallons);
        totalMiles += miles;
        totalGallons += gallons;
        System.out.println("Total MPG so far: " + (totalMiles / totalGallons));
    }
}
}