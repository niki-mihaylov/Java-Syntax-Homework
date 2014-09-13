import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ax: ");
		int ax = input.nextInt();
		System.out.print("Ay: ");
		int ay = input.nextInt();
		System.out.print("Bx: ");
		int bx = input.nextInt();
		System.out.print("By: ");
		int by = input.nextInt();
		System.out.print("Cx: ");
		int cx = input.nextInt();
		System.out.print("Cy: ");
		int cy = input.nextInt();
		
		int result = Math.round(Math.abs((ax * (by - cy) + bx * (cy - ay) + cx * (ay - by))/2));
		if (result != 0) {
			System.out.println("The triangles's area is " + result);
		}
		else {
			System.out.println("0");
		}
	}
}
