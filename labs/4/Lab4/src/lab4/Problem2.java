package lab4;

public class Problem2 {

	public static void main(String[] args) {
		char [ ] [ ] randmatx = new char [5] [5] ;
		
		for (int p = 0; p < 5; p++) {
		
		for (int i = 0; i < 5; i++)
		{
			randmatx[p][i] = (char)('a' + Math.random() * ('z' - 'a'));         
		}
		}
		for (int j = 0; j < 5; j++) {
			
			for (int k = 0; k < 5; k++)
			{
				System.out.print(randmatx[j][k]);
			}
			System.out.println("");
		}

	}

}
