import java.util.Scanner;

public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		int m = n;
		int counterOfPairs = 0;
		int counter = 0;
		int mask = 1;
		mask <<= 31;
		while ((n & mask) == 0) {
			mask >>= 1;
			counter++;
			if (counter == 31) {
				break;
			}
		}
		mask = 1;
		int prev = n & 1;
		for (int i = 0; i < 31 - counter; i++) {
			n >>= 1;
			if ((n & 1) == prev) {
				counterOfPairs++;
			}
			prev = n & 1;
		}
		System.out.println(m + " has " + counterOfPairs + " equal bit pairs");
	}
}
