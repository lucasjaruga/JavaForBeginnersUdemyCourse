package JavaCodingChallenge7.commandline1;
public class CommandLine1 {
	public static void main(String [] args){
		System.out.println(args);
		System.out.println(args.length);
		
		if(args.length != 0){
			System.out.print("Args stores: ");
			for(String x : args){
				System.out.print(x + " ");
			}
		}
		System.out.println();
		String [] arr = new String[] {"John", "Joe", "Lucy"};
		for(String val : arr){
			System.out.println(val);
		}
	}
}