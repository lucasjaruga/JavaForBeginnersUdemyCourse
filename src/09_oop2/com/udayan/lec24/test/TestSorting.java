/**
 * Test class to sort an int array by either using BubbleSort or NewIntSort.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec24.test;

import com.udayan.lec24.BubbleSort;
import com.udayan.lec24.NewIntSort;
import com.udayan.lec24.SortingUtil;

public class TestSorting {
	public static void main(String[] args) {
		int [] arr1 = {200, 10, 0 , -76};
		//SortingUtil.sortIntArray(arr1, new BubbleSort()); //Use sort(int []) method of BubbleSort to sort the array
		SortingUtil.sortIntArray(arr1, new NewIntSort()); //Use sort(int []) method of NewIntSort to sort the array
		printIntArray(arr1);
	}
	
	/**
	 * This method prints all the elements in an int array.
	 * 
	 * @param arr int [] object to print
	 */
	private static void printIntArray(int [] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
