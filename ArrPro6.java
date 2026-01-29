package com.problemsolving;

public class ArrPro6 {
		public static void Frequen(int [] arr, int frequency) {
			int count = 0;
			for(int i=0; i<arr.length;i++) {
				if(arr[i]==frequency) {
					count++;
				}
			}
			System.out.println(count);
		}
	
	
	public static void main(String[] args) {
		int [] arr = {2,3,4,5,2,4,2,3,2};
		int frequency = 2;
		Frequen(arr,frequency);
		
	}

}
