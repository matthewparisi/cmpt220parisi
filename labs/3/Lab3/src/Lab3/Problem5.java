package Lab3;
import java.util.Scanner;
class Problem5 {
	
	public static double average(double a, double b, double c) {
		a = a + b + c;
		
		return a / 3;
	}

	public static void main(String[] args) {
		System.out.println("enter 3 numbers and I'll aveage them: ");
		System.out.println("One: ");
		Scanner input = new Scanner(System.in);
		System.out.println("Two: ");
		Scanner input2 = new Scanner(System.in);
		System.out.println("Three: ");
		Scanner input3 = new Scanner(System.in);
		
		double inputone = input.nextDouble();
		double inputtwo = input2.nextDouble();
		double inputthree = input3.nextDouble();
		
		double answer = average(inputone, inputtwo, inputthree);
		
		System.out.println(answer);
		
		

	}

}
