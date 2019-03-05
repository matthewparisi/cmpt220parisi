package lab4;
import java.util.Random;
public class Problem5 {

	public static void main(String[] args) {
		 Random rand = new Random();
		 int[] numbers = new int[1000]; 
		 int[] numsmall = new int[600];
		 int[] numbig = new int[600];
		 int countsmall = 0;
		 int countbig = 0;
		   double average = 0;
		    for(int i = 0; i < numbers.length; i++) {
		      numbers[i] = rand.nextInt(101);;
		      average += numbers[i] ;
		    }
		    
		    average = average / 1000 ;
		    for(int i = 0; i < numbers.length; i++) {
		    	if (numbers[i] > average ) {
		    		numbig[countbig] = numbers[i];
		    		countbig ++;
		    	}
		    	else {
		    		numsmall[countsmall] = numbers[i];
		    		countsmall ++;
		    	}
		    }
		    System.out.println("lower than average");
		    for(int i = 0; i < numsmall.length; i++) {
		    	System.out.print(numsmall[i] + " ");
		    }
		    System.out.println("");
		    System.out.println("Larger than average");
		    
		    for(int i = 0; i < numbig.length; i++) {
		    	 System.out.print(numbig[i] + " ");
		    }
		    
		   

	}

}
