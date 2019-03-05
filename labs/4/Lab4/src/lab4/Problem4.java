package lab4;
import java.util.Scanner;
public class Problem4 {
	
	 static class stringchecker {
		static final int maxlen = 256;
		
		 static void multichecker(String s) { 
			 int count[] = new int[maxlen];
			 
			 for (int i = 0; i < s.length() ; i++) 
		            count[s.charAt(i)]++; 
		  
		        char car[] = new char[s.length()]; 
		        for (int i = 0; i < s.length(); i++) { 
		            car[i] = s.charAt(i); 
		            int finder = 0; 
		            for (int j = 0; j <= i; j++) { 
		  
		                // If any matches found 
		                if (s.charAt(i) == car[j])  
		                    finder++;                 
		            } 
		            if (finder == 1)  
		                System.out.println("Number of Occurrence of " + 
		                 s.charAt(i) + " is:" + count[s.charAt(i)]);             
		        } 
		    } 
	

	public static void main(String[] args) {
		System.out.println("Enter a string and i'll tell you the amount of each letter");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		s = s.replaceAll("\\s+", "");
		s = s. toLowerCase() ;
		multichecker(s);

	}

}
}