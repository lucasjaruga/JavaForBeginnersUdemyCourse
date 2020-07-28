package JavaCodingChallenge16.Question5;

public class Ques05 {
	public static void main(String[] args) {
		String s = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		
		System.out.println(filterString(s));
	}
	
	private static String filterString(String str) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i)) || Character.isWhitespace(str.charAt(i))) {
				builder.append(str.charAt(i));
			}
		}
		return builder.toString();
	}
}