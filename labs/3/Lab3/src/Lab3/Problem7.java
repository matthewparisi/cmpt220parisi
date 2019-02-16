package Lab3;

public class Problem7 {

	public static void main(String[] args) {
		int number = 0 ;
		int counter = 0;
		for(int n = 1; n < 51; n++ ) {
			number = (3 * (n * n) - n)/ 2;
			System.out.print(number);
			System.out.print(" ");
			counter = counter + 1;
			
			if (counter == 10 ) {
				System.out.println("");
				counter = 0 ;
			}
		}


	}

}
