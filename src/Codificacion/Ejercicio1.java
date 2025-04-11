package string_compressor;

public class SimpleStringCompressor {


	public static void main(String[] args) {
	
		String  str = "aaaabbbcca";
		System.out.println(str + " -> " + SimpleStringCompressor.compress(str));
		str = "abbcccaaaa";
		System.out.println(str  + " -> " +  SimpleStringCompressor.compress(str));
		str = "abca";
		System.out.println(str  + " -> " + SimpleStringCompressor.compress(str));
		
		
		str = "a3b12c3";
		System.out.println(str + " -> " + SimpleStringCompressor.decompress(str));
		str = "a3b12c10";
		System.out.println(str + " -> " + SimpleStringCompressor.decompress(str));
	
		
	}
	
	public static String compress(String str ) {	
	
		String compressedStr = "";
		int length = str.length();
		int i = 0; 
		while(i < length) {
			int count = 1;
			while(  i+count < length && 
					str.charAt(i)==str.charAt(i+count)) {
				count++;
			}
			compressedStr = compressedStr + str.charAt(i) + count;
			i += count;
		}

		return compressedStr;
		
	}
	
	public static String decompress(String str) {
		
		String decompressedStr  = "";
		int length = str.length();
		int i = 0; 
		while(i < length) {
			
			String charRepeatable = String.valueOf(str.charAt(i));
			String trunk = charRepeatable;
			int count = 1;

			int j = i+1;
			while(j < length &&
					str.charAt(j) >= '0' &&
					str.charAt(j) <= '9'
					) {
				 j++;
			}
			
			int repeatLimit= Integer.parseInt(str.substring(i+1, j));
								
			while(count < repeatLimit ) {
				trunk += charRepeatable;
				count++;
			}
			
			decompressedStr += trunk;
			i=j;
			
		}

		return decompressedStr;
		
	}
	
	
}



