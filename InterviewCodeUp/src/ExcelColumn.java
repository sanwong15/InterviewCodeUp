/*
 * San Wong
 */

public class ExcelColumn {

	public static void main(String[] args) {
		// TestCase 1: AA   TestCase 2: "A"
		String testString1 = "AA";
		String testString2 = "A";
		String testString3 = "AA2";
		String testString4 = "2AA2";
		String testString5 = "AA#";
		String testString6 = "#AA#";
		System.out.println("AA: " + convert(testString1));
		System.out.println("A: " + convert(testString2));
		System.out.println("AA2: " + convert(testString3));
		System.out.println("2AA2: " + convert(testString4));
		System.out.println("AA#: " + convert(testString5));
		System.out.println("#AA#: " + convert(testString6));

	}
	
	public static int convert(String s){
		int resultValue =0;
		char[] charArray = s.toCharArray();
		int len = charArray.length;
		
		for (int i=0; i<len; i++){
			char currentChar = charArray[i];
			int currentCharValue = (int)currentChar;
			
			//If it is lower case, update it to upper case
			if (currentCharValue >= 97 && currentCharValue <=122){
				currentCharValue = currentCharValue-32;
			}
			
			
			//Validation
			if (currentCharValue >122 || (currentCharValue>=91 && currentCharValue <=96) || currentCharValue<65){
				resultValue = resultValue/26;
				currentCharValue = (int)'A'-1;
			}
			
			int value = currentCharValue - (int)'A'+1;
			resultValue += (int) Math.pow(26, (len-1)-i) * value;
		}
		
		return resultValue;
	}

}
