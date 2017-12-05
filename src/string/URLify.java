//Input: "Mr John Smith    ",13
//Output: "Mr%20John%20Smith"

package string;

public class URLify {
	public static String urlify(String s, int length){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<length;i++){
			if(s.charAt(i) == ' '){
				sb.append('%');
				sb.append('2');
				sb.append('0');
			}
			else
				sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		String s ="Mr John Smith    ";
		int length =13;
		System.out.println(urlify(s,length)+" end");
	}
}
