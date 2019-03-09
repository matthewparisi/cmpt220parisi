package lab5;
import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		//Inputs 
		System.out.println("Enter the length of the lists you want to compaire: ");
		Scanner input = new Scanner(System.in);
		int listlen = input.nextInt();
		int[] listone = new int [listlen];
		int[] listtwo = new int [listlen]; 
		
		System.out.println("Enter the first list ");
		for(int i = 0; i < listlen; i++) {
			listone[i] = input.nextInt();
		}
		
		System.out.println("Enter the second list ");
		for(int i = 0; i < listlen; i++) {
			listtwo[i] = input.nextInt();
		}
		//runs a method to check if two arrays are equal 
		boolean equaltoo = equal(listone , listtwo);
		
		if (equaltoo) {
			System.out.println("The two arrays are equal. ");
		}
		else {
			System.out.println("The two arrays are not equal. ");
		}
		input.close();
	}
	
	public static boolean equal(int[] x, int[] y) {
		//returns true if the arrays have the same elements 
		int totaldifference = 0;
		
		for (int i = 0; i < x.length; i++){
			totaldifference += x[i] - y[i];
        }
		return (totaldifference == 0);
		
		
	}
 
}
