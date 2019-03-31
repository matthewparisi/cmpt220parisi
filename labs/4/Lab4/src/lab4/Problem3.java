package lab4;
import java.util.Scanner;
public class Problem3 {
	
	static class MyString {
		
		public static String reverse(String s) {
			String holder = s;
			String st = "";
			for (int i = s.length() - 1; i > 0; i--) {
				st += holder.charAt(i);	
			}
			return st;	
		}
		
		public static boolean isPalindrome(String p) {
			for (int c = 0; c < p.length() - 1; c++ ) {
				for (int d = p.length()- 1; d > 0; d--) {
					if ( p.charAt(c) != p.charAt(d)) {
						  return false;
					}
				}
			}
				return true;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a string and find out if its a palindrome");	
		Scanner input = new Scanner(System.in);
		String wordpal = input.nextLine();
		
		String revwordpal = MyString.reverse(wordpal);
		boolean ispal = MyString.isPalindrome(revwordpal);
		
		if (ispal == true) {
			System.out.print(wordpal);
			System.out.print(" was a palindrome");
		}
		else {
			System.out.print(wordpal);
			System.out.print(" was not a palindrome");
		}

	}

}
	
