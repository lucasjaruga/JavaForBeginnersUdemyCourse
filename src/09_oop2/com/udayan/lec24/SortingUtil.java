/**
 * SortingUtil provides utility method, sortIntArray(int [], ISort) to
 * sort an int array using passed implementation of ISort.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec24;

public class SortingUtil {
	public static void sortIntArray(int [] arr, ISort s) {
		s.sort(arr);
	}
}
