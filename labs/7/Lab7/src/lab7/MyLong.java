package lab7;

public class MyLong {
	long value ;
	
	MyLong(long value){
		this.value = value;
	}
	long getValue() {
		return value;
	}
	
	public boolean isEven() {
		return value % 2 == 0;
	}
	
	public boolean isOdd() {
		return value % 2 != 0;
	}
	
	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if(value % i == 0)
				return false ; 
		}
		return true;
		
	}
	
	boolean equals(long value) {
		return this.value == value ;
	}
	
	boolean equals(MyLong value) {
		return this.value == value.getValue();
	}
	
	long parselong(char car[]) {
		String str = "";
		long numberholder;
		for(int i = 0; i < car.length; i++) {
			str += car[i];
		}
		numberholder = Long.parseLong(str);
		return numberholder;
	}
	
	long parselong(String stringone) {
		String str = stringone;
		long numberholder;
		numberholder = Long.parseLong(str);
		return numberholder;
	}
	
	

}
