/**
 * This example covers following points:
 * 1. Every enumeration constant has its ordinal value, it starts with 0.
 *    In below enum, ordinal value of MONDAY is 0, TUESDAY is 1, ..., SUNDAY is 6
 * 2. ordinal() method returns ordinal value
 * 3. compareTo() method compares the ordinal value of two constants of the same enum
 * 4. static valueOf(string) and values() method are added to this enum at compile time and are available in Java docs.
 * 5. double equals operator (==) should be used to compare two constants of the same enum
 * 
 * For details, watch video lecture 4 of Section 12.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec04;

public enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
