import java.util.Scanner;


public class FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 500: ");
		int a = input.nextInt();
		System.out.print("Enter a floating-point number: ");
		float b = input.nextFloat();
		System.out.print("Enter another floating-point number: ");
		float c = input.nextFloat();
		
		String str = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
		
		System.out.printf("|%-10X|%s|%10.2f|%-10.3f|", a, str, b, c);
	
		
	}

}
