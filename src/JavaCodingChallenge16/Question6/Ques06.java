package JavaCodingChallenge16.Question6;

public class Ques06 {
	public static void main(String[] args) {
		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
		System.out.println(decodeTheCode(str1));
		
		String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
		System.out.println(decodeTheCode(str2));
	}
	
	private static String decodeTheCode(String str) {
		StringBuilder decoded = new StringBuilder();
		if(str != null && str.trim().length() > 0) {
			char[] chars = str.trim().toCharArray();
			for(char a : chars) {
				if(Character.isAlphabetic(a) || a == ' '){
					decoded.append(a);
				}
			}
			
			String [] arr = decoded.toString().split(" ");
			decoded.delete(0, decoded.length());
			for(String temp : arr) {
				decoded.append(toNumber(temp));
			}
		}
		
		return decoded.reverse().toString();
	}
	
	private static String toNumber(String check) {
		switch (check.toUpperCase()) {
			default:
				return "";
		
			case "ZERO":
				return "0";
				
			case "ONE":
				return "1";
				
			case "TWO":
				return "2";
				
			case "THREE":
				return "3";
				
			case "FOUR":
				return "4";
				
			case "FIVE":
				return "5";
				
			case "SIX":
				return "6";
				
			case "SEVEN":
				return "7";
				
			case "EIGHT":
				return "8";
				
			case "NINE":
				return "9";
		}
	}
	
}