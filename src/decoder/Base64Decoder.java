package decoder;

public class Base64Decoder {
	final char[] base64Chars = {
		'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
		'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
		'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
		'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '+', '/'
	};
	
	public static byte convertBase64Char(char c){
		byte convertedChar = -1;
		
		//put your code here
		
		return convertedChar;
	}
	
	public static byte[] base64ToByteArray(String s){
		byte[] decodedBytes = new byte[3];
		
		//put your code here
		
		return decodedBytes;
	}
}
