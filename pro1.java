package com.problemsolving;

public class pro1 {
	public static int maxSum(int[] arr, int k) {
		int maxValue = Integer.MIN_VALUE;
		for(int i=0; i<=arr.length-k;i++) {
			int sum = 0;
			int currentIndex = i;
			for(int j=0; j<k; j++) {
				sum = sum+arr[currentIndex];
				currentIndex++;
			}
			maxValue = Math.max(maxValue, sum);
		}
		return maxValue;
	}
	

	public static void main(String[] args) {
		int [] arr = {2,1,5,1,3,2};
		int k = 3;
		System.out.println(maxSum(arr, k));
	}

}
