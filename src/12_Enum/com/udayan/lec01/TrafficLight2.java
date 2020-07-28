/**
 * Java enumeration (enum) example.
 * 1. All enums in Java implicitly extend from java.lang.Enum class but we cannot 
 *    explicitly extend an enum from java.lang.Enum or java.lang.Object class.
 * 2. java.lang.Enum class overrides toString() method, which returns the String name of the constant. 
 *    For enum constant RED, toString() method returns "RED".
 * 3. Enums can implement interfaces.
 * 
 * For details, watch video lecture 1 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec01;

public enum TrafficLight2 { //keyword enum is used to declare a Java enum
	RED(40, "STOP"), AMBER(5, "SLOW"), GREEN(60, "GO"); //If no code after this line, then semicolon (;) is not compulsory
	
	private int duration;
	private String message;
	
	TrafficLight2(int duration, String message){
		//System.out.println("Inside contructor");
		this.duration = duration;
		this.message = message;
	}
	
	public int getDuration() {
//		switch(this.toString()) {
//			default:
//				System.out.print("");
//				break;
//			case "RED":
//				System.out.print("STOP! ");
//				break;
//			case "AMBER":
//				System.out.print("SLOW! ");
//				break;
//			case "GREEN":
//				System.out.print("GO! ");
//				break;
//		}
		return duration;
	}
	
	public String getMessage() {
		return message;
	}
}