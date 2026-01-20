package com.problemsolving;

public class pro2 {
	public static void getAverage(int [] arr,int k) {
		//int maxValue = Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-k;i++) {
			double sum = 0;
			int currentindex = i;
			for(int j=0;j<k;j++) {
				sum = sum+arr[currentindex];
				currentindex++;
			}
			System.out.println(sum/k);
		}
	}

	public static void main(String[] args) {
      int[] arr = {1,2,3,4,5};
      int k = 2;
      getAverage(arr,k);
	}

}
