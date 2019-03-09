package lab5;
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		//Inputs 
		System.out.println("Enter the length of the rows for your matrix: ");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		
		System.out.println("Enter the length of the columns for your matrix: ");
		int col = input.nextInt();
		
		double [][] array = new double [row][col];
		for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
            	 System.out.println("matrix position " + i + " , " + j);
                array[i][j] = input.nextDouble();
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
	}
		//prints the original matrix
		System.out.println("The original matrix: ");
		for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
            	System.out.print(array[i][j] + " ");
            }
            System.out.println();
		}
		//runs a method that transposes a matrix 
		double [][] transposedmat =  transposematrix(array);
		System.out.println();
		System.out.println("The transposed matrix: ");
		for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
            	System.out.print(transposedmat[i][j] + " ");
            }
            System.out.println();
		}
		input.close();
	}	
	public static double[][] transposematrix( double [][]array ) {
		//takes in a matrix and transposes it
		
		double tranarray[][] = new double[array[0].length][array.length];

	    for (int i = 0; i < array.length; i++) {
	        for (int j = 0; j < array[0].length; j++) {
	        	tranarray[j][i] = array[i][j];
	        }
	    }
	    	return tranarray;

	}
	
	

}

