package string;

import java.util.HashMap;

public class maxoccuringcharacter {
	public static char countCharacter(String s){
		HashMap<Character,Integer> hM = new HashMap<>();
		int max =0;char c = 0;
		for(int i=0;i<s.length();i++){
			int count = 0;
			if(hM.containsKey(s.charAt(i))){
				count = hM.get(s.charAt(i));
				hM.put(s.charAt(i), count+1);
			}
			else{
				hM.put(s.charAt(i),1);
			}
			if(max < count) {
				max = count;
				c = s.charAt(i);
			}
		}
		return c;
	}
	public static void main(String[] args){
		String s = "meeeeetpatekkkkkkkk";
		char answer = countCharacter(s);
		System.out.println(answer);
	}
	
}
