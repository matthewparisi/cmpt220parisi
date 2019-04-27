package lab9;
import java.util.Random; 
import java.util.Scanner;
public class onehundredints {

	public static void main(String[] args) {
		Random randint = new Random();
		int [] array1 = new int[100];
		Scanner input1 = new Scanner(System.in);
		for(int i = 0; i < 100; i++) {
			array1[i] = randint.nextInt(1000);
		}
		System.out.println("Pick a number between 0 and 100 and get a random number: ");
		int p = input1.nextInt();
		input1.close();
		
			System.out.print(array1[p]) ;

	}

}
