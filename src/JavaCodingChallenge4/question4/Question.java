package JavaCodingChallenge4.question4;

public class Question {
	public static void main(String[] args) {
		for(int i = 1; i <= 8; i++) {
			for(int j = 1; j <= 8; j++) {
				if((i*j)%2 == 0) {
					System.out.print("B ");
				} else {
					System.out.print("W ");
				}
			}
			System.out.println();
		}
		
		
        int x = 4;
        switch (x) {
           
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3: 
                System.out.println("x is equal to 3");
                break;
            default:
                System.out.println("Still no idea what x is");
        }
        
        
        
        start:
        for (int i = 2; i <= 100; i = i + 2) {
            for(int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
            if(i == 10) {
                break start;
            }
        }
        
        int a = 7;
        boolean res = a++ == 7 && ++a == 9 || ++a == 9;
        System.out.println("a = " + a);
        System.out.println("res = " + res);
	}
}