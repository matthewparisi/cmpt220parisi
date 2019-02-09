package lab2;
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		System.out.println("Enter two strings and I will compare them lexicographically");
		System.out.println("String1: ");
		Scanner input = new Scanner(System.in);
		String one = new String (input.next());
		System.out.println("String2: ");
		Scanner input2 = new Scanner(System.in);
		String two = new String (input2.next());
		System.out.println(one.compareTo(two));
		char temp;
		for (int i = one.length() - 1 ; i > 0; i = i -1) { 
	             temp = one.charAt(i); 
	             System.out.print(temp);
	        } 
		 System.out.println();
		 for (int p = two.length() -1 ; p > 0; p= p-1) { 
             temp = two.charAt(p); 
             System.out.print(temp);
        } 
		
		
		
		

	}
}
