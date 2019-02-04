package lab1;
import java.util.Scanner;
public class Problem4 {
	public static void main(String[] args) {
		System.out.println("Enter the mass of an object and i'll tell you its energy: ");
		Scanner input = new Scanner(System.in);
		double mass = input.nextDouble() ; 
		double c = 299972458 ;
		double energy = mass *(c * c);
		System.out.println("Engery for the given mass is" + energy);
		
		
		
	}
}
