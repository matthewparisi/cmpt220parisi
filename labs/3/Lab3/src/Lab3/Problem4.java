package Lab3;

public class Problem4 {
	
	public static boolean isprime(int num) {
	        for( int check = 2; check < Math.sqrt(num); check++ )
	        {
	            if( num % check == 0 )
	            {
	                return false;
	            }
	        }
	        return true;
	    }

	public static void main(String[] args) {
		
		for( int number = 15000; number > 0 ; number-- ){
			
            if( isprime(number) ){
                System.out.println(number);
                break;
            }
        }
		
		
	}
}
