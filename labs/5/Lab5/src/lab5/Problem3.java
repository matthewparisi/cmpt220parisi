package lab5;
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		//Receiving inputs 
		System.out.println("Enter the number of students in the class: ");
		Scanner input = new Scanner(System.in);
		int numstudents = input.nextInt();
		String[] names = new String [numstudents];
		int[] grades = new int [numstudents]; 
		
		System.out.println("Enter the list of names");
		for(int i = 0; i < numstudents; i++) {
			names[i] = input.next();
		}
		
		System.out.println("Enter the list of grades");
		for(int i = 0; i < numstudents; i++) {
			grades[i] = input.nextInt();
		}
		
		//Sorting 
		int temp = 0 ;
		String stemp = new String ("") ;
		for(int j = 0; j < numstudents; j++) {
			 for (int i = 0; i < grades.length -1 ; i++) {
		            if (grades[i] > grades[i + 1]) {
		                temp = grades[i];
		                stemp = names[i];
		                grades[i] = grades[i + 1];
		                names[i] = names[i+1];
		                grades[i + 1] = temp; 
		                names[i + 1] = stemp;
		               
		            }
		}
		
	}
		
		
	System.out.println("The sorted lists of names and grades");	
	//prints sorted list 
		for(int i = numstudents - 1; i >= 0; i--) {
			System.out.println("");
			System.out.print(names[i] + " : ");
			System.out.print(grades[i]);
		}	
		
		input.close();
}
}
