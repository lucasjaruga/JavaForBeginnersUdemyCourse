/**
 * DiscountedGymMembership1 class. 
 * This class is written from Scratch and doesn't extend GymMembership class.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec09;

public class DiscountedGymMembership1 {
	private String memberName;
	private double duration;
	private double monthlyFee;
	private double discount;
	
	/**
	 * Parameterized Constructor.
	 * 
	 * @param name the name of the member
	 * @param duration the membership duration
	 * @param monthlyFee per month fee
	 * @param discount discount to offer
	 */
	public DiscountedGymMembership1(String name, double duration, double monthlyFee, double discount) {
		this.memberName = name;
		this.duration = duration;
		this.monthlyFee = monthlyFee;
		this.discount = discount;
	}
	
	/**
	 * Returns the total discounted cost of gym membership.
	 * 
	 * @return total cost of gym membership
	 */
	public double getTotalCost() {
		double cost = duration * monthlyFee;
		return cost - (cost * discount);
	}
	
	@Override
	public String toString() {
		String det = memberName + ", " + duration + ", " + monthlyFee + ", " + discount;
		return det;
	} 
}
