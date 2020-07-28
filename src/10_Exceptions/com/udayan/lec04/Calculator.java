/**
 * Calculator class has divide(int, int) method, which returns the result by dividing num by den.
 * divide(int, int) method throws an instance of DenominatorZeroException, which is an unchecked exception. 
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec04;

public class Calculator {
	public static int divide(int num, int den) {
		if(den == 0) {
			throw new DenominatorZeroException("Denominator is 0."); //Provide the cause
		}
		int res = num / den;
		return res;
	}
}
