package lab5;
import java.util.Scanner;
public class Problem6 {

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
		System.out.println("What is the column number you want to average 0 is columb 1");
		int colindex = input.nextInt();
		//runs a method that averages the col number you input
		double averageofcol = averagecol(array, colindex);
		System.out.println("The average of column " + colindex + " " + averageofcol);
		input.close();
	} 
	
	public static double averagecol(double[][] array, int column) {
		//moves through a column and averages it returning the average
		double average = 0;
		for(int i = 0; i < array.length; i++ ) {
			average += array[i][column];
		}
		average = average / array.length;
		
		return average;
	}

}
