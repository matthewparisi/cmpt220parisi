package lab5;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		//initializing variables
		double [] array = new double [10];
		Scanner input = new Scanner(System.in);
		
		//getting users input of 10 numbers
		for(int i = 0; i < array.length ; i++) {
			double inputholder = 0;
			System.out.println("enter number " + i + " out of 10");
			inputholder = input.nextDouble();
			array[i] = inputholder;
			
		}
		//runs max returns the largest value 
		double mxval = max(array);
		System.out.println("The Highest value you entered was " + mxval);
		
		/**for(int i = 0; i < array.length ; i++) {
			System.out.println(array[i]);
		}
		*/
			
		input.close();
	}
	
	public static double max(double[] array) {
		//runs through an array by length and returns the largest num
		double maxval = 0;
		
		
		for(int i = 0; i < array.length ; i++) {
			if(maxval < array[i] ) {
				maxval = array[i];
			}
		}
		return maxval;
		
	}

}
