package com.problemsolving;

public class ArrPro1 {
	public static void sum(int [] arr) {
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
//			int sum = 0;
			sum = sum + arr[i];
			
		}
		System.out.println(sum);
	}
	
	
	public static void main (String [] args) {
	int [] arr = {3,2,1,4,5};
	sum(arr);
	}
}
