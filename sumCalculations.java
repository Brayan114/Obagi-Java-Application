public class sumCalculations() {
public static void main(String[] args){
    int sum100 = 0;
    for (int i = 1; i <= 100; i++) {
        sum100 += i;
    }
    System.out.println("Sum of first 100 numbers: " + sum100);
    
    Scanner input = new Scanner(System.in);
    int sumArbitrary = 0, num;
    System.out.println("Enter positive numbers to sum (0 to stop):");
    while ((num = input.nextInt()) != 0) {
        sumArbitrary += num;
    }
    System.out.println("Sum of entered numbers: " + sumArbitrary);
	
	}
}