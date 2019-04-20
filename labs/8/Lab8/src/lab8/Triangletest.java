package lab8;
import java.util.Scanner;
public class Triangletest {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		double a,b,c ;
		System.out.println("Enter value for sides 1 2 and 3: ");
		a = input1.nextDouble();
		b = input1.nextDouble();
		c = input1.nextDouble();
		Triangle tri = new Triangle(a, b, c) ;
		System.out.println("Enter a color followed by true if you want it to be filled in: ");
		String tricolor = "";
		boolean filled ;
		tricolor = input1.next();
		filled = input1.hasNextBoolean();
		tri.setFilled(filled);
		tri.setColor(tricolor);
		
		String holder1 = "";
		String holder2 = "";
		holder1 = tri.tostring();
		holder2 = tri.toString();
		System.out.println(holder1 + " " +  holder2);
		input1.close();
	}

}
