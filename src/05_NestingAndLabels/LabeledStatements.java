/**
 * Example of Labeled Statements in Java. 
 * 
 * Following statements are labeled in this example:
 * 1. if statement
 * 2. switch-case
 * 3. while loop
 * 4. do-while loop
 * 5. for loop
 * 6. expression
 * 7. assignment
 * 
 * @author Udayan Khattry
 */
public class LabeledStatements {
	public static void main(String[] args) {
		int i = 1;
		if_label: //label for if statement
			if(i == 1)
				System.out.println("A");
		
		switch_label: //label for switch-case
			switch(i) {
				case 1:
					System.out.println("B");
					break;
				default:
					System.out.println("C");
			}
		
		while_loop: //label for while loop
			while(i > 1) {
				System.out.println("D");
			}
			
		do_while_loop: //label for do-while loop
			do {
				System.out.println("E");
			} while(i > 1);
			
		outer: //label for outer loop
			for(int j = 0; j < 2; j++) {
			    inner: //label for inner loop
				for (int k = 0; k < 2; k++) {
					System.out.print(j * k);
				}
				System.out.println();
			}
			
		expression: //label for expression
			i = i + 1;
			
		assignment: //label for assignment
			i = 0;
		
		LabeledStatements: //Class name can be used as label
			i = 100;
			
		main: //method name can be used as label
			i = 200;
			
		//Variable declaration can't be labeled	
		/*delatartion:
			int var = 10;*/
	}
}
