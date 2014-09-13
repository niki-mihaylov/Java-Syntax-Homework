import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rectangle's width: ");
		int a = input.nextInt();
		System.out.print("Enter rectangle's height: ");
		int b = input.nextInt();
		System.out.println("The rectangle's area is " + (a * b));
	}
}
