/**
 * Example on how to find out unreachable objects (eligible objects for Garbage Collection).
 * Check the corresponding Video lecture for complete understanding.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lecture20;

class Point {
	public int x; //instance variable x
	public int y; //instance variable y
	
	//Parameterized constructor
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class GCExample {
	public static void main(String[] args) { //L1: LOCAL reference variable args, which refers to String [] object of size 0
		Point p1 = new Point(1,1); //L2: Creates a Point object, which is referred by LOCAL reference variable p1
		Point p2 = new Point(3,4); //L3: Creates a Point object, which is referred by LOCAL reference variable p2
		int x = 5; //L4: Local primitive variable x, which is initialized to 5
		p1 = p2; //L5: p1 refers to the object referred by p2. Object create at "L2" is eligible for garbage collection
		p2 = null; //L6: p2 refers to null, but object referred earlier by p2 is still being referred by p1
		
		changePoint(p1, 10, 20); //L7: changePoint(Point, int, int) method is invoked
		
		p1 = new Point(4,4); //L17: Creates another Point object, p1 now refers to this object as a result object create at "L3" becomes unreachable
		p1 = null; //L18: p1 refers to null, object create at "L17" becomes unreachable
	}//L19: main method goes out of STACK memory, which deletes all the LOCAL variables, String [] object create at "L1" is unreachable now
	
	public static void changePoint(Point p, int x, int y) { //L8: LOCAL reference variable p refers to the same object referred by p1, 10 is copied to x and 20 is copied to y
		p.x = x; //L9: changes p.x to 10 (which will change p1.x as well as p.x == p1.x)
		p.y = y; //L10: changes p.y to 20(which will change p1.y as well as p.y == p1.y)
		
		for(int i = 1; i <= 2; i++) { //L11: LOCAL primitive variable i is created and initialized to 1
			p = new Point(0, i);
			//L12: On first execution of the loop, new Point object is created and reference variable p now refers to this object. But this statement doesn't make any object eligible for Garbage Collection
			//L13: On second execution of the loop, another Point object is created and reference variable p now refers to this object. At this statement object created at "L12" becomes eligible for Garbage Collection
		}
		//L15: Variable i dies.
	} //L16: STACK memory for changePoint(Point, int, int) is freed up and it makes object created at "L13" becomes eligible for Garbage Collection.
}

