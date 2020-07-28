/**
 * DiscountedGymMembership2 class.
 * Parent class is GymMembership.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec09;

public class DiscountedGymMembership2 extends GymMembership {
	private double discount;
	
	/**
	 * Parameterized Constructor.
	 * 
	 * @param name the name of the member
	 * @param duration the membership duration
	 * @param monthlyFee per month fee
	 * @param discount discount to offer
	 */
	public DiscountedGymMembership2(String name, double duration, double monthlyFee, double discount) {
		super(name, duration, monthlyFee); //Calling constructor of parent class
		this.discount = discount;
	}
	
	@Override
	public double getTotalCost() {
		double cost = super.getTotalCost(); //Calling getTotalCost() method of parent class
		return cost - (cost * discount);
	}
	
	@Override
	public String toString() {
		String det = super.toString() + ", " + discount; //Calling toString() method of parent class and concatenating discount to it.
		return det;
	} 
}
