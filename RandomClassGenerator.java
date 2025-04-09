import java.util.Random;
public class RandomClassGenerator{
	public static void main(String[] args){
		Random random = new Random();
		
		boolean option = random.nextBoolean();
		System.out.printf("Do you love java %b%n", option);
		
		int integerwithNoBound = random.nextInt();
		System.out.printf("The random number is %d%n", integerwithNoBound);
		
		int integerwithBound = random.nextInt(2000) + 1;
		System.out.printf("The random number is %d%n", integerwithBound);
		
		int longwithBound = random.nextLong();
		System.out.printf("The random number is %d%n", longwithBound);
		
		int FloatwithBound = random.nextFloat();
		System.out.printf("The random number is %d%n", FloatwithBound);
		
		int DoublewithBound = random.nextDouble();
		System.out.printf("The random number is %d%n", DoublewithBound);
	}
}