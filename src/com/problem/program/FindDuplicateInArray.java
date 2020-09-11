package com.problem.program;

import java.util.Arrays;

public class FindDuplicateInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 3, 2, 9};

		int result = findDuplicate(arr);
		if (result == -1) {
			System.out.println("No Duplicate");
		} else {
			System.out.println("Duplicate Element :" + result);
		}
	}

	/* Brute Force Approach 
	private static int findDuplicate(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				return arr[i];
			}
		}
		return -1;

	}*/
	/* Optimal Solution*/
	private static int findDuplicate(int[] arr) {
		
		int slow = arr[0];
		int fast = arr[0];
		
		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
		}while(slow != fast);
		
		fast = arr[0];
		
		while(slow != fast) {
			slow = arr[slow];
			fast = arr[fast];
		}
		
		return slow;
	}

}
