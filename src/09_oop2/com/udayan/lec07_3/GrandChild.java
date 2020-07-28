/**
 * Example to show that any class in Java can explicitly extend from one class only.
 * 
 * Following syntax gives compilation error:
 * public class GrandChild extends Child1, Child2
 * public class GrandChild extends Child1; Child2
 * public class GrandChild extends Child1 extends Child2
 * 
 * If this class was allowed to extend from Child2 class as well, then object of GrandChild class would 
 * get confused which m1() method to call Child1 version or Child2 version.
 * This is known as "Deadly Diamond Of Death".
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec07_3;

public class GrandChild extends Child1 {

}
