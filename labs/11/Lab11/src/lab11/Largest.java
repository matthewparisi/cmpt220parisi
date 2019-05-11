package lab11;
import java.util.Scanner;
public class Largest {

		public static void main(String[] args) {
			int num;
			int max;
			
			int[] array = new int[8];
			
			Scanner input1 = new Scanner(System.in);
			
			System.out.println("Enter 8 numbers: ");
			for(int i = 0;i<8;i++) {
				num = input1.nextInt();
				array[i] = num;
			}
			input1.close();
			max = array[0];
			
			max = maximum(array, array.length-1, max);
			System.out.println("Largest element" + "in the array is: " + max);
			

		}

		private static int maximum(int[] array, int len, int max) {
			if(len > -1) {
				if(array[len]>max) {
					max = array[len];
				}
				return (max = maximum(array, len-1,max));
			}
			else
			return max;
		}

	}


	


