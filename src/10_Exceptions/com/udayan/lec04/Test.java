/**
 * Test class to work with checked(NegativeNumberException) and unchecked(DenominatorZeroException) exceptions.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec04;

public class Test {
	/*
	 * Even it is possible to have throws clause for main method, you can provide checked/unchecked exceptions in the 
	 * throws clause of main method but is not recommended at all.
	 * 
	 * main method forwards the exception object to JVM, which simply prints the stack trace and terminates the program.
	 */
	public static void main(String[] args) {
		try {
			distribute(1200, 0);
		} catch(DenominatorZeroException e) {
			System.out.println(e);
		}

		try {
			registerParticipant("Jack", -18);
		} catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * distribute(int, int) method ducks the DenominatorZeroException as it has not handled it
	 * using try-catch block.
	 * 
	 * It is optional to to either declare(using throws clause) or handle(using try-catch block) unchecked exceptions.
	 */
	private static void distribute(int noOfChocolates, int noOfParticipants) {
		System.out.println(Calculator.divide(noOfChocolates, noOfParticipants));
	}
	
	/*
	 * registerParticipant(String, int) method ducks the NegativeNumberException as it has not handled it
	 * using try-catch block.
	 * It is compulsory to declare the checked exception using throws clause, if it is not handled using try-catch.
	 */
	private static void registerParticipant(String name, int age) throws NegativeNumberException {
		Participant p = new Participant();
		p.setName(name);
		p.setAge(age);
	}
}
