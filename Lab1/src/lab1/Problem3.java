package lab1;
import java.util.Scanner;
public class Problem3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of grams and it will be output in ounces: ");
		double ounces = input.nextDouble()  ;
		ounces = ounces / 28.3496 ;
		System.out.println("That many grams makes up " + ounces + " ounces." );
		 
		
		
	}

}
