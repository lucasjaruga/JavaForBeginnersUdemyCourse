package JavaCodingChallenge17.Question4;

public class Ques04 {
	
	enum Sports {
		// Golf, Cricket, Tennis, Boxing
		//Tennis, Cricket, Golf, Boxing
		//Boxing, Tennis, Cricket, Golf
		Tennis, Boxing, Golf, Cricket
	}
	
	public static void main(String[] args) {
		System.out.println(Sports.Golf.compareTo(Sports.Tennis));
		System.out.println(Sports.Cricket.compareTo(Sports.Golf));
		System.out.println(Sports.Tennis.compareTo(Sports.Boxing));
	}
}