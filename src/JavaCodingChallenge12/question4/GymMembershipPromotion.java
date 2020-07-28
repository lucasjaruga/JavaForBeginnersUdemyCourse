package JavaCodingChallenge12.question4;

public class GymMembershipPromotion extends GymMembership{
	
	public GymMembershipPromotion(String name, double duration, double monthlyFee) {
		super(name, duration, monthlyFee);
	}
	
	private double getDiscount() {
		double memberDiscount = 0;
		char firstNameLetter = getMemberName().toLowerCase().charAt(0);
		switch(firstNameLetter) {
			default:
				memberDiscount = 0.2;
				break;
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				memberDiscount = 0.5;
		}
		return memberDiscount;
	}
	
	@Override
	public double getTotalCost() {
		return super.getTotalCost() - (super.getTotalCost() * getDiscount());
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + getDiscount();
	}
}