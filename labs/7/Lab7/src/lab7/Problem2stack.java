package lab7;
import java.util.Scanner;
public class Problem2stack {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter an intiger and I will break it down to its factors: ");
		int num = input1.nextInt();
		StackOfIntegers stack = new StackOfIntegers();
		for(int i = 2; i <= num; i++) {
			while(num % i == 0) {
				stack.push(i);
				num = num / i;
			}
		}
			int size = stack.getSize();
			for(int i = 0; i < size ; i++)
				System.out.print(stack.pop() + " ");
			
		input1.close();
}
}