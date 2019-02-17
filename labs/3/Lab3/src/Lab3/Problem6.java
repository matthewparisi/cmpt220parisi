package Lab3;
import java.util.Scanner;
public class Problem6 {
	
	public static int the(String a) {
		int vowelcounter = 0;
		
		for (int i = 0; i <= a.length() - 1; i++) {
		char let = a.charAt(i);
		if (let == 'a' || let == 'A') {
			vowelcounter = vowelcounter + 1;
		}
		if (let == 'e' || let == 'E') {
			vowelcounter = vowelcounter + 1;
		}
		if (let == 'i' || let == 'I') {
			vowelcounter = vowelcounter + 1;
		}
		if (let == 'o' || let == 'O') {
			vowelcounter = vowelcounter + 1;
		}
		if (let == 'u' || let == 'u') {
			vowelcounter = vowelcounter + 1;
		}
		
		}
		
		return vowelcounter;
	}

	public static void main(String[] args) {
		System.out.println("enter a string and I'll count the vowels: ");
		System.out.println("Enter the String: ");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine(); // JA
		int vowelcount = the(word);
		System.out.println(vowelcount);

	}

}
