package lab4;
import java.util.Scanner;
public class Problem7 {
// it removes duplicates I don't know why I can't make a duplicate array 
	public static void main(String[] args) {
		System.out.println("Enter a list of numbers and i'll remove the duplicates, How long should it be");
		
		Scanner input = new Scanner(System.in);
		
		int len = input.nextInt();
		
		input.close();
		
		int [] array = new int [100];
		int arraycount = 0;
		int counter = 0 ;
		for (int i = 95; i > -1 - 1; i--) {
				System.out.println("Enter values for the array");
				// got this error with the scanner Exception in thread "main" java.util.NoSuchElementException
				
				array[counter] = arraycount ;
				counter += 1 ; 
				
			if (counter % 2 == 1) {
					arraycount += 1;
					System.out.print(" +1 ");
			}
		}
		
		int [] dupfreearray = removeDuplicates(array);
		
		System.out.println("");
		
		for (int i= 0; i < array.length - 1 ; i++ ) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
		
		System.out.println("");
		
		for (int i= 0; i < dupfreearray.length - 1 ; i++ ) {
			System.out.print(dupfreearray[i]);
			System.out.print(" ");
		}
	
	}
	
	public static int[] removeDuplicates(int[] arr) {

	    int end = arr.length;

	    for (int i = 0; i < end; i++) {
	        for (int j = i + 1; j < end; j++) {
	            if (arr[i] == arr[j]) {                  
	                int shiftLeft = j;
	                for (int k = j+1; k < end; k++, shiftLeft++) {
	                    arr[shiftLeft] = arr[k];
	                }
	                end--;
	                j--;
	            }
	        }
	    }

	    int[] duplicatefree = new int[end];
	    for(int i = 0; i < end; i++){
	    	duplicatefree[i] = arr[i];
	    }
	    return duplicatefree;
	}

}
