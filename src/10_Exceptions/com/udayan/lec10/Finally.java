/**
 * Cases for which finally block is executed:
 * 1. When code in try block executes successfully.
 * 
 * 2. When code in try block throws an exception for which catch-block is provided,
 *    finally block is executed after executing catch block.
 *    
 * 3. When catch block re-throws the exception object, finally block is executed 
 *    before exception object is forwarded to the calling method.
 *    
 * 4. When try block throws an exception for which catch-block is not provided,
 *    finally block is executed before exception object is forwarded to the calling method.
 *    
 * 5. return statement is encountered in try or catch block, finally block is executed 
 *    before control is transferred to the calling method.
 *    
 * Cases for which finally block is not executed:
 * 1. If the JVM shuts down or exits, while the try or catch code is being executed.
 * 	  JVM can shut down for two reasons:
 *    A. Internally because of some error.
 *    B. Code from try or catch block calls System.exit(int); method.
 * 
 * Watch video lecture 10 of Section 10 for details.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec10;

public class Finally {
	public static void main(String[] args) {
		checkFinally();
	}
	
	private static void checkFinally() {
		try{
			System.out.println("Inside try block.");
			//throw new ArithmeticException();
			//throw new ArrayIndexOutOfBoundsException();
			//return;
			//System.exit(-1); //finally block is not executed in this case.
		} catch(ArithmeticException ex) {
			System.out.println("Inside catch block.");
			//throw ex;
		} finally {
			System.out.println("Inside finally block.");
		}
	}
}
