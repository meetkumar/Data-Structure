/*One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -) true
pales, pale -) true
pale, bale -) true
pale, bae -) false*/


package string;

public class OneAway {
	
	private static boolean check(String a, String b){
		if(Math.abs(a.length() - b.length()) >1) return false;
		
		String s1 = a.length() > b.length() ? a:b;
		String s2 = a.length() > b.length() ? b:a;
		int index1 =0, index2 =0;
		boolean foundDiff = false;
		while(index1 < s1.length() && index2 < s2.length()){
			if(s1.charAt(index1) != s2.charAt(index2)){
				if(foundDiff) return false;
				foundDiff=true;
				if(s1.length()==s2.length()) index2++;
			}
			else{
				index2++;
			}
			index1++;
		}
		return true;
	}
	
	public static void main(String[] args){
		String a = "pale";
		String b = "pqa le";
		System.out.print(check(a,b));
	}
}
