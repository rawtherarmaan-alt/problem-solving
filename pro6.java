package com.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class pro6 {
	public static void minSum(int[] arr,int k) {
		int minValue = Integer.MAX_VALUE;
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<=arr.length-k;i++) {
			int sum = 0;
			for(int j=i;j<k+i;j++) {
				sum = sum + arr[j];
				
			}
			if(minValue>sum) {
				minValue=sum;
             for(int z=i;z<k+i;z++) {
            	 list.add(arr[z]);
            }
		  }	
		}
		
		System.out.println(minValue);
		System.out.println(list);
		
	}

	public static void main(String[] args) {
		int[] arr = {2,1,5,1,3,2};
		int k = 3;
		minSum(arr,k);
	}

}
