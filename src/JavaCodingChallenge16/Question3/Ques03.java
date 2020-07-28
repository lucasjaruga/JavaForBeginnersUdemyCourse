package JavaCodingChallenge16.Question3;

public class Ques03 {
	public static void main(String[] args) {
		String str1 = "Core";
		String str2 = " Java";
		
		String s1 = str1 + str2;
		System.out.println(s1);
		
		String s2 = str1.concat(str2);
		System.out.println(s2);
		
		String s3 = s1.intern();
		System.out.println(s3);
	}
}
