/*String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).*/

package string;

public class StringCompression {
	
	private static int countCompress(String str){
		int compressLength =0;
		int countConsecutive = 0;
		for(int i=0;i<str.length();i++){
			countConsecutive++;
			if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
				compressLength += 1 + String.valueOf(countConsecutive).length();
				countConsecutive=0;
			}
		}
		return compressLength;
	}
	
	private static String compress(String s){
		int finalLength = countCompress(s);
		StringBuilder sb = new StringBuilder(finalLength);
		int countConsecutive =0; 
		for(int i=0;i<s.length();i++){
			countConsecutive++;
			if(i+1>=s.length() || s.charAt(i) != s.charAt(i+1)){
				sb.append(s.charAt(i));
				sb.append(countConsecutive);
				countConsecutive=0;
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		String s = "aabcccccaax ";
		System.out.println(compress(s));
	}
}
