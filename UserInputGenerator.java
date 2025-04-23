// Write to generate a number based on the input of a user. upper limit of a numer should be inclusive
import java.security.SecureRandom;
import java.util.Scanner;
public class UserInputGenerator{
	public static void main(String[] args){
		 SecureRandom random = new SecureRandom();
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Input a number");
		 long ans = input.nextLong();
		 
		
			if (ans<=0){
				System.out.println("Number must be greater than 0");
			}
			else{
				long number = random.nextLong(ans) +1 ;
				System.out.println("The Lower Limit is 0");
				System.out.println("The Upper Limit is "+(ans+1));
				System.out.printf("The generated number is %d%n", number);
			}
		
		
	}
	
}