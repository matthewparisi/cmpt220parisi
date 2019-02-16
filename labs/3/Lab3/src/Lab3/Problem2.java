package Lab3;

public class Problem2 {

	public static void main(String[] args) {
		int start = 100; 
		int counter = 0;
		while (start < 501) {
			
			if (start % 5 == 0 || start % 7 == 0 ) {
				System.out.print(start);
				System.out.print(" ");
				counter = counter + 1;
			}
			start = start + 1;
				if (counter == 10 ) {
					System.out.println(" ");
					counter = 0;
				}	
	

		}

	}
	
}
