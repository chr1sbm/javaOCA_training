
public class KeyDifferences {
	//LINE BELOW DOESN'T COMPILE , CAN'T ASSIGN NULL TO A PRIMITVE TYPE
	//int value = null;  
	
	//null means that text doesn't point any object
	
	
	
	
	//does not compile
	//int bad = len.length();
	
	public static void main(String[] args) {
	
	 System.out.println(textIsEmpty(""));
		
	}
	
	
	
	static boolean textIsEmpty(String text) {
		
		return text.equals(null);
		
	}

}
