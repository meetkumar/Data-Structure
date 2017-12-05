package string;

public class secondMaxoccurence {
	
	public static char occu(String s){
		int[] count =new int[256];
		int maxA = 0,maxB = 0;
		for(int i=0;i<s.length();i++){
			count[s.charAt(i)]++;
		}
		for(int i=0;i<256;i++){
			if(count[maxA] < count[i]){
				maxB= maxA;
				maxA = i;
			}
			else if(count[maxB] < count[i] && count[i]!=count[maxA]){
				maxB = i;
			}
		}
		return (char)maxB;
	}
	
	public static void main(String[] args){
		String s = "meeeeetpateklllllkkkkkkk";
		char answer = occu(s);
		if (answer != '\0')
	         System.out.println("Second most frequent char"+
	                                       " is " + answer);
	      else
	         System.out.println("No second most frequent"+
	                                       "character");
	}
}
