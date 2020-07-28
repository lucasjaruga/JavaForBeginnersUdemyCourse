package com.udayan.lecture19;
/** @author Udayan Khattry */
public class InitializationBlocks2 {
	public int x = 0; //4, 8
	public static int y = 2017; //1
	
	public InitializationBlocks2() {
		System.out.println("No-arg constructor."); //7
	}
	
	public InitializationBlocks2(int x) {
		System.out.println("Parameterized consturctor."); //11
	}
	
	static {
		System.out.println("1st static initialization block."); //2
	}
	
	{
		System.out.println("1st instance initialization block."); //5, 9
	}
	
	static {
		System.out.println("2nd static initialization block."); //3
	}
	
	{
		System.out.println("2nd instance initialization block."); //6, 10
	}
	
	public static void main(String[] args) {
		new InitializationBlocks2();
		new InitializationBlocks2(5);
	}
}

/*
I am not providing any comments in this file, in case you want to debug the same file at your end.
All the concepts were covered in depth in the video lecture. Check it for details.
*/