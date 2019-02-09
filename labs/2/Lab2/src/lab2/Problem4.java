package lab2;
import java.util.Scanner;
public class Problem4 {
	public static void main(String[] args) {
		System.out.println("Enter two charicters and I'll add them");
		System.out.println("char1: ");
		Scanner input = new Scanner(System.in);
		char char1 = input.next().charAt(0) ;
		System.out.println("char2: ");
		Scanner input2 = new Scanner(System.in); // JA: You need only one scanner
		char char2 = input2.next().charAt(0);
		int one = char1;
		int two = char2;
		System.out.println("the int value of the two chars is " + one + two);
		

	}

}
