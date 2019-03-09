package lab5;
import java.util.Scanner;
public class Problem7 {

	public static void main(String[] args) {
		//inputs 
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
		//calls a method to check if a matrix is an Upper triangular matrix
		boolean uppertri = isUpperTriangular(array);
		
		
		//prints if it is a triangular matrix or not
		if(uppertri){
            System.out.println("Upper triangular matrix.");
        }
		else{
            System.out.println("Not an Upper triangular matrix.");
        }
		input.close(); 
	}
	
	public static boolean isUpperTriangular(double[][] array) {
		//checks if a matrix is an Upper triangular matrix and returns true if is false if not
		boolean isuppertriang = true ;
		 for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < i; j++) {
	                if (array[i][j] != 0) {
	                    isuppertriang = false;
	                    break;
	                }
	            }
	            if (!isuppertriang) {
	                break;
	            }
	        }
	       
	        if(isuppertriang){
	            return true;
	        }
	        else{
	            return false;
	        }
		
	}

}
