package com.problemsolving;

public class ArrPro4 {
	public static int findkey(int [] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				return i;
			}
		}
		
		return -1;
	
	}

	public static void main(String[] args) {
		int [] arr = {1,4,2,7,9};
		int key = 7;
		System.out.println(findkey(arr,key));

	}

}
