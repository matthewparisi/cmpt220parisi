package lab11;
import java.util.Scanner;
public class Addition {
static int sum;


public static void main(String[] args) {
	try {
		System.out.println("enter a number: ");
		
		Scanner input1 = new Scanner(System.in);
		String input = input1.next();
		int number = Integer.parseInt(input);
		System.out.print(" The sum is: " + sumDigits(number));
		input1.close();
	}
	catch(Exception e) {
		System.out.print("Exception ");
		System.exit(0);
	}
	
	}
	
	public static int sumDigits(long p) {
		if(p > 0) {
			sum = sum + (int)p % 10;
			sumDigits(p/10);
		}
	return sum;
	
	}
	
	
}




 