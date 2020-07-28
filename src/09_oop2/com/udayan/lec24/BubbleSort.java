/**
 * BubbleSort implements ISort and implements sort(int []) method.
 * The sort(int []) method uses bubble sort algorithm to sort the int array.
 * 
 * @author Udayan Khattry
 */
package com.udayan.lec24;

public class BubbleSort implements ISort {
	@Override
	public void sort(int[] arr) {
		int swap = 0;
		for (int i = 0; i < arr.length - 1; i++) { // Loop through from 1st element to 2nd last element
			//when i = 0, j < arr.length - 1
			//when i = 1, j < arr.length - 2
			//when i = 2, j < arr.length - 3
			//After first iteration, last element in the array is the highest number
			//After second iteration, last 2 elements in the array are sorted in ascending order and so on
			for (int j = 0; j < (arr.length - i - 1); j++) {
				if (arr[j] > arr[j + 1]) {
					swap = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = swap;
				}
			}
		}
	}
}
