package com.problem.program;

public class Sort012 {
	public static void main(String[] args) {

		int arr[] = { 1, 1, 2, 2, 0, 1, 0, 0, 1, 2 };
		int result[] = sort012Array(arr);
		for(int k = 0; k < result.length; k++) {
			System.out.print(result[k]+",");
		}

	}

	private static int[] sort012Array(int[] arr) {
		int low = 0;
		int mid = 0;
		int temp = 0;
		int high = arr.length - 1;

		while (mid <= high) {
			switch (arr[mid]) {
			case 0 : {
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1 : {
				mid++;
				break;
			}
			case 2 : {
				temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
				break;
			}
			}
		}

		return arr;
	}
}
