import java.util.Scanner;


public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive decimal integer: ");
		int decNum = input.nextInt();
		String hexNum = Integer.toHexString(decNum);
		System.out.println("The hexadecimal format of " + decNum + " is " + hexNum.toUpperCase());
	}

}