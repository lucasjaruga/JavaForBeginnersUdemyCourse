package com.mycode;
/**
 * This class uses StringUitls class from company1 and company2.
 * This code belongs to www.mycode.com
 * 
 * @author Udayan Khattry
 * @version 1.0.0
 */
import com.company1.StringUtils;

public class UseStringUtils3 {
	public static void main(String [] args) {
		//Below StringUtils class is mapped to com.company1.StringUtils by import statement.
		String s1 = StringUtils.reverse("UDAYAN");
		System.out.println(s1);
		
		//Below StringUtils class can't be mapped by import statement as its 
		//Simple name is colliding with other class.
		//Only way to resolve this conflict is the in-line usage of Fully Qualified Name.
		String s2 = com.company2.StringUtils.concat("Udayan", "Khattry");
		System.out.println(s2);
	}
}
