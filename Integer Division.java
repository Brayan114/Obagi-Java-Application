public class integerDivision() {
	public static void main(String[] args){
    int a = 5, b = 2;
    System.out.println("5 / 2 = " + (a / b)); // Outputs 2, fractional part is lost
    System.out.println("To avoid this, use double: " + (5.0 / 2)); // Outputs 2.5
	}
}