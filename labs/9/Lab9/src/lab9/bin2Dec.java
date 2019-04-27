package lab9;

public class bin2Dec {
	
	public static int binTwoDec(String binaryString) throws NumberFormatException {
		int decimal = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if(binaryString.charAt(i) == '1') { 
				decimal +=2;
			} 
			else if (binaryString.charAt(i) != '0') {
			throw new NumberFormatException();
			}
			decimal *= 2;
		}
		decimal = decimal / 2;
		return decimal;
	}
	
}
