package JavaCodingChallenge16.Question2;

public class Ques02 {
	public static void main(String[] args) {
		String str = "abcdef";
		System.out.println(reverse(str));
	}
	
	private static String reverse(String source) {
		int x = source.length();
		int z = 0;
		char [] reversed = new char[x];
		for(int y = x; y > 0 ; y--) {
			reversed[z++] = source.charAt(y-1);
		}
		String afterReversing = new String(reversed);
		
		return afterReversing;
	}
}
