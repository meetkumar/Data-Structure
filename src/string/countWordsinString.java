package string;

public class countWordsinString {
	private static final int OUT = 0;
	private static final int IN = 1;

	public static int count(String s){
		int i=0;
		int state = OUT;
		int wc=0;
		
		while(i<s.length()){
			if(s.charAt(i) == '\n' || s.charAt(i) == '\t' || s.charAt(i)== ' '){
				state = OUT;
			}
			else if(state == OUT){
				state = IN;
				++wc;
			}
			++i;
		}
		return wc;
	}
	
	public static void main(String[] args){
		String s ="what is your     name?";
		int ans = count(s);
		System.out.println(ans);
	}
}
