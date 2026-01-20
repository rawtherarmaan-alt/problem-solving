package com.problemsolving;

public class pro5 {
	public static void maxNum(int[] arr, int k) {
		int maxValue = Integer.MIN_VALUE;
		for(int i=0; i<=arr.length-k;i++) {
			//int sum = 0;
			int currentIndex = i;
			for(int j=0; j<k; j++) {
				if(arr[currentIndex]>maxValue) {
					maxValue = arr[currentIndex];
				}
				currentIndex++;
			}
			System.out.println(maxValue);
		 
		}
		

	}
	public static void main(String[] args) {
		int [] arr  = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		
		maxNum(arr,k);
	}

}

