//Check whether string 1 is substring of string 2 without using built-in functions


package string;

public class substring {
	
	boolean isSubstring(String a, String b){
		int n = a.length() > b.length() ? a.length() : b.length();
		int m = a.length() > b.length() ? b.length() : a.length();
		int i=0,j=0, count =1;
		while(i<n && count<=m){
			if(a.charAt(i) == b.charAt(j)){
				count++;j++;
			}
			else {count=0;j=0;}
			i++;
		}
		if(count == m) return true;
		return false;
	}
	
	public static void main(String[] args){
		substring s =new substring();
		System.out.println("String is substring "+s.isSubstring("geekforgeks", "geks"));
	}
}
