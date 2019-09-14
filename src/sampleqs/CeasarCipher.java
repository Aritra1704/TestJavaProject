package sampleqs;

public class CeasarCipher {

	public static void main(String[] args) {
		char c = 'a';
		System.out.println(c);
		System.out.println((int) c);
		
		c = (char) (c+3);
		System.out.println(c);
		System.out.println((int) c);
		
		System.out.println(caesarCipher("middle-Outz", 2));
	}

	// Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
    	StringBuilder result = new StringBuilder();
    	k = k % 26;
    	char resultChar = 'a';
    	for(int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		String selectedChar = c + "";
    		if(selectedChar.matches("^[A-Z]*$")) {
    			int z = 'Z';
    			resultChar = cipherChar(c, z, k);
    		} else if(selectedChar.matches("^[a-z]*$")) {
    			int z = 'z';
    			resultChar = cipherChar(c, z, k);
    		} else
    			resultChar = c;
    		result.append(resultChar + "");
    	}
    	return result.toString();
    }
    
    static char cipherChar(char c, int z, int k) {
    	char result = 'a';
    	if((c + k) > z) {
			result = (char) (c + k - 26);
		} else
			result = (char) (c + k);
    	return result;
    }
}
