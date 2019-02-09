package lab2;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Problem3 {
	public static void main(String[] args) {
		System.out.println("Enter two numbers the first as a lower bound the second as a upper bound");
		System.out.println("number1: ");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt() ;
		System.out.println("number2: ");
		Scanner input2 = new Scanner(System.in); 
		int number2 = input2.nextInt() ;
		
		int randint = ThreadLocalRandom.current().nextInt(number1, number2 + 1);
		int randint2 = ThreadLocalRandom.current().nextInt(number1, number2 + 1);
		int randint3 = ThreadLocalRandom.current().nextInt(number1, number2 + 1);
		
		System.out.println("here are three randome numbers in those bounds:");
		System.out.println(randint);
		System.out.println(randint2);
		System.out.println(randint3);
		
		
	}

}
