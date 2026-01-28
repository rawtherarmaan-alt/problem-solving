package com.problemsolving;

//import java.util.ArrayList;
//import java.util.List;

public class ArrPro2 {
		public static void sorting(int [] arr) {
		//List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j = i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				
			}
			
		}
		
		
		for (int num : arr ) {
			
			System.out.print(num + " ");
			
		}
			
	}
		
	public static void main(String[] args) {
		int [] arr = {6,2,4,5,1,3};
		sorting(arr);
	}

}
