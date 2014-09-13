import java.util.Scanner;


public class PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x coordinate: ");
		double x = input.nextDouble();
		System.out.print("Enter y coordinate: ");
		double y = input.nextDouble();
		
		boolean inFigure1 = false; //left part
		boolean inFigure2 = false; //upper part
		boolean inFigure3 = false; //right part
		
		if (x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5) {
			inFigure1 = true;
		}
		if (x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5) {
			inFigure2 = true;
		}
		if (x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5) {
			inFigure3 = true;
		}
		if (inFigure1 | inFigure2 || inFigure3) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}
}
