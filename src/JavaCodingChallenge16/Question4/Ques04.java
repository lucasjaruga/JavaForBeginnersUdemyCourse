package JavaCodingChallenge16.Question4;

public class Ques04 {
	private static String [] arr = {
			"    ",
			"A",
			"abcdefmQtpz",
			"a$bcddd",
			"wxfdskjf55",
			"zt+ts",
			null
	};
	
	public static void main(String[] args) {
		for(String s : arr) {
			boolean result = hasAllAlphabets(s);
			if(result)
				System.out.println("Yes");
			else {
				System.out.println("No");
			}
		}
	}
	
	private static boolean hasAllAlphabets(String str) {
		if(str != null && str.trim().length() > 0) {
			for(int i = 0; i < str.length(); i++) {
				if(!Character.isAlphabetic(str.charAt(i))) {
					return false;
				}
			}
			return true;
		}
		
		return false;
	}
}
