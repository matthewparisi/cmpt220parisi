package lab2;
import java.util.Scanner;
public class Problem1 {
	public static void main(String[] args) {
		System.out.println("Enter two numbers and I'll compare them for you");
		System.out.println("number1: ");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt() ;
		System.out.println("number2: ");
		Scanner input2 = new Scanner(System.in); 
		int number2 = input.nextInt() ;
		System.out.println(number1 + " is less than " + number2 + " : " + (number1 < number2));
		System.out.println(number1 + " is less than or equel too " + number2 + " : " + (number1 <= number2));
		System.out.println(number1 + " is equel too " + number2 + " : " + (number1 == number2));
		System.out.println(number1 + " is not equel too " + number2 + " : " + (number1 != number2));
		System.out.println(number1 + " is greater than " + number2 + " : " + (number1 > number2));
		System.out.println(number1 + " is greater than or equel too " + number2 + " : " + (number1 >= number2));
		
		
		
		
		
	}

}
