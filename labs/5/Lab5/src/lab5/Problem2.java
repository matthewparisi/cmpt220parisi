package lab5;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		
		double [] array = new double [10];
		Scanner input = new Scanner(System.in);
		
		//getting users input of 10 numbers
		for(int i = 0; i < array.length ; i++) {
			double inputholder = 0;
			System.out.println("enter number " + i + " out of 10");
			inputholder = input.nextDouble();
			array[i] = inputholder;
			
		}
		//runs methods stores and prints the answers
		double standdeviation = deviation(array);
		double finalmean = mean(array);
		
		System.out.println("The standard deviation is " + standdeviation + " The mean is " + finalmean);
		input.close();
	}

	public static double deviation(double[] x) {
		//gets standard deviation from an array
		double mean = 0; 
		double standdev = 0;
		for(int i = 0; i < x.length ; i++) {
			mean += x[i];
		}
		mean = mean / x.length;
		
		for(int i = 0; i < x.length ; i++) {
			standdev = Math.pow(x[i] - mean, 2) ; 
		}
		standdev = standdev / (x.length-1);
		
		return standdev;
	}
	
	
	
	public static double mean(double[] x) {
		//gets mean from an array
		double mean = 0;
		
		for(int i = 0; i < x.length ; i++) {
			mean += x[i];
		}
		mean = mean / x.length;
		
		return mean;
	}
}
