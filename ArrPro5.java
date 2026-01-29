package com.problemsolving;

public class ArrPro5 {
	public static void possPair(int [] arr, int k) {
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=i+1;j<arr.length;j++) {
				sum = arr[i]+arr[j];
				if(sum==k) {
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,8,-1,3,6};
		int k = 7;
		possPair(arr,k);
		
	}

}
