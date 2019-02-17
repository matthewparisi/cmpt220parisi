package Lab3;
import java.util.Scanner;
// JA
public class Problem1 {

	public static void main(String[] args) {
		int total = 0;
		int i = 1;
		int counter = 0;
		int evencount = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter numbers here enter a 0 to end: ");
		while (i != 0) {
			i = input.nextInt();
			total = total + i;
			counter = counter + 1;
			if (i % 2 == 0 && i != 0) {
				evencount = evencount + 1;
			}	
		}
		System.out.println("The number of even numbers: " + evencount );
		System.out.println("The total sum: " + total );
		System.out.println("The average is: " + total / counter );

	}

}
