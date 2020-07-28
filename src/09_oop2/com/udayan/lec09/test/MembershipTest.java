/**
 * Class to test all the Membership classes.
 * DiscountedGymMembership1 and DiscountedGymMembership2 are same as far as behaviors are concerned but structurally they are different.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec09.test;

import com.udayan.lec09.DiscountedGymMembership1;
import com.udayan.lec09.DiscountedGymMembership2;
import com.udayan.lec09.GymMembership;

public class MembershipTest {
	public static void main(String[] args) {
		GymMembership m1 = new GymMembership("Udayan", 6, 3000);
		System.out.println(m1);
		System.out.println(m1.getTotalCost());
		
		DiscountedGymMembership1 m2 = new DiscountedGymMembership1("Rahul", 12, 3000, .20);
		System.out.println(m2);
		System.out.println(m2.getTotalCost());
		
		DiscountedGymMembership2 m3 = new DiscountedGymMembership2("Rahul", 12, 3000, .20);
		System.out.println(m3);
		System.out.println(m3.getTotalCost());
	}
}
