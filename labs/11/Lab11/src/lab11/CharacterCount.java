package lab11;

import java.util.Scanner;

public class CharacterCount {
	
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("enter a string: ");
		String input = input1.nextLine();
		char[] array = input.toCharArray();
		System.out.println("enter a character and I'll tell you how many times it occurs in the string: ");
		String str = input1.next();
		char cha = str.charAt(0);
		int occurs = count(array, cha);
		
		System.out.println("the number of occurences of character above: " + occurs );
		input1.close();
	}
	
	public static int count(char[] chas, char cha) {
		return count(chas, cha, chas.length - 1);
		
	}
	
	public static int count(char[] chas, char cha, int highnum) {
		
		if(highnum >= 0 ) {
			int count = 0;
			char cha1 = chas[highnum];
			if(Character.toUpperCase(cha) == Character.toUpperCase(cha1)) {
				count++;
			}
			
			return count + count(chas, cha, highnum -1 );
		}
		
		else {
			return 0;
		}
		
	}
	
	

}



