package lab4;
import java.util.Scanner;
public class kattisprog1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int h, w, n;
		boolean brickslayedpossible = true;
		h = input.nextInt();
		w = input.nextInt();
		n = input.nextInt();
		
		int index = 0;
		int layer = 0;
		int brick;

		for (int i = 0; i < n; i++) {
			brick = input.nextInt();
			index += brick;
			if (index > w) {
				brickslayedpossible = false;
				break;
			} 
			else if (index == w) {
				index = 0;
				layer++;
				if (layer == h) {
					break;
				}
			}
		}
		
		if (brickslayedpossible) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		input.close();
	}

}
