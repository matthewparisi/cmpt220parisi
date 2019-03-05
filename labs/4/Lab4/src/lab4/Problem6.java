package lab4;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		int[] array = new int[11];
		int i =0;
		int q = 0;
		array = arraycreator(array);
		while(q > 10) {
			System.out.print(array[q]);
			q += 1;
		}
		array = arrayreplace(array, 3 , 10);
		array = arrayreplace(array,  7, 100);
		while(i > 10) {
			System.out.print(array[i]);
			i+=1;
		}
	
		

	}
	
	public static int[] arraycreator(int[] arr) {
		for(int i = 0; i < 10; i++) {
			arr[i] = i + 1;
		}
		return arr ; 
		
	}
	
	public static int[] arrayreplace(int[] arry , int place, int num) {
		
		arry[place] = num ;
		return arry;
	}

}
