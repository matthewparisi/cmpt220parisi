package lab8;
import java.util.Scanner; 
import java.util.ArrayList;
public class Testprogram {
	
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		ArrayList <Integer> numlist = new ArrayList <>();
		System.out.print("Input 5 numbers: ");
		
		for(int i = 0; i <= 5; i++) {
			numlist.add(input1.nextInt());
		}
	
		sorter(numlist);
		System.out.println(" ");
		for(int k = 0; k < numlist.size(); k++) {
			System.out.print(numlist.get(k) + " " );
		}
		
		input1.close();
	}
	
	public static void sorter(ArrayList <Integer> numberlist){
		int numholder ;
		for(int i = 0; i <= 5; i++) {
			for(int p = i + 1; p < numberlist.size() ; p++) {
				numholder = numberlist.get(i);
				if (numberlist.get(i) > numberlist.get(p) ) {
					numberlist.set(i, numberlist.get(p) );
					numberlist.set(p, numholder );
				}
			}
		}
	}


} 
