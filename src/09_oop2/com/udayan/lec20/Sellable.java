/**
 * Sellable is an interface, note the use of interface keyword.
 * This interface has an abstract method getPrice().
 * 
 * All the animals, which are sellable will implement this interface.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec20;

public interface Sellable {
	public abstract double getPrice();
}
