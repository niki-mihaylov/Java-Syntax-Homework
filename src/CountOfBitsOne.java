import java.util.Scanner;


public class CountOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		int counter = 0;
		int mask = 1;
		
		for (int i = 0; i < 32; i++) {
			if ((n & mask) != 0) {
				counter++;
			}
			mask <<= 1;
		}
		System.out.println("The number of 1s in " + n + " is " + counter);
	}
}
