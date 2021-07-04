import java.util.Scanner;
public class LineComparisonTest{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the x1: ");
		int x1 = sc1.nextInt();
		System.out.println("Enter the x2: ");
		int x2 = sc1.nextInt();
		System.out.println("Enter the y1: ");
		int y1 = sc1.nextInt();
		System.out.println("Enter the y2: ");
		int y2 = sc1.nextInt();

		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		LineComparison l = new LineComparison();
		double result = l.length(x1,x2,y1,y2);
		System.out.println("Length of 2 points is " + result);
	}
}
