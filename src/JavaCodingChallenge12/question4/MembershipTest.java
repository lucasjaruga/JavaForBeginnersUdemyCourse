package JavaCodingChallenge12.question4;

public class MembershipTest {
	public static void main(String[] args) {
		GymMembershipPromotion obj1 = new GymMembershipPromotion("Lucas", 12, 150);
		System.out.println(obj1);
		System.out.println(obj1.getTotalCost());
		
		System.out.println("---------------");
		
		GymMembershipPromotion obj2 = new GymMembershipPromotion("Ola", 12, 150);
		System.out.println(obj2);
		System.out.println(obj2.getTotalCost());
		
		System.out.println("---------------");
		
		GymMembershipPromotion obj3 = new GymMembershipPromotion("Ula", 12, 150);
		System.out.println(obj3);
		System.out.println(obj3.getTotalCost());
		
		System.out.println("---------------");
		
		System.out.println(obj1);
		System.out.println(obj1.getTotalCost());
		
	}
}