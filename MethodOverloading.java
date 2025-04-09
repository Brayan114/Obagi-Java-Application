import java.util.Scanner;
public class MethodOverloading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate Perimeter of different shapes");
		System.out.println("Enter 1 to Calculate Perimeter of A Square");
		System.out.println("Enter 2 to Calculate Perimeter of a Rectangle");
		System.out.println("Enter 3 to Calculate Perimeter of a Circle");
		System.out.println();
		
		System.out.println("Enter your choice");
		int choice = input.nextInt();
		
		switch(choice){
			
		case 1:{
			System.out.println(" Enter the length of the square: ");
			int lengthofSquare = input.nextInt();
			
			MethodOverloading.shape(lengthofSquare);
		}
		break;
		
		case 2:{
			System.out.println(" Enter the length of the rectangle: ");
			int lengthofRectangle = input.nextInt();
			
			System.out.println(" Enter the breadth of the rectangle: ");
			int breadthofRectangle = input.nextInt();
			
			MethodOverloading.shape(lengthofRectangle, breadthofRectangle);
		}
		break;
		
		case 3:{
			System.out.println(" Enter the radius of the circle: ");
			double radiusofCircle = input.nextDouble();
			
			MethodOverloading.shape(radiusofCircle);
		}
		break;
		
		default:
		System.out.println("Invalid input");
	}
	}	
	public static void shape(int length){
		int perimeterOfSquare = 4 * length;
		
		System.out.printf("The perimeter of a Square is %d%n", perimeterOfSquare);
	}
	
	public static void shape(int length, int breadth){
		int perimeterOfRectangle = 2*(length + breadth);
		
		System.out.printf("The perimeter of a Rectangle is %d%n", perimeterOfRectangle);
	}
	
	public static void shape(double radius){
		double perimeterOfCircle = 2* Math.PI * radius;
		
		System.out.printf("The perimeter of a Circle is %d%n", perimeterOfCircle);
		
	}
}
