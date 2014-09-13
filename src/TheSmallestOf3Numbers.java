import java.util.Scanner;


public class TheSmallestOf3Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double a = input.nextDouble();
		System.out.print("Enter the second number: ");
		double b = input.nextDouble();
		System.out.print("Enter the third number: ");
		double c = input.nextDouble();
		
		double smallest = ((a > b) ? b : a) > c ? c : ((a > b) ? b : a);
		
		System.out.println("The smallest number is " + smallest);
	}

}
