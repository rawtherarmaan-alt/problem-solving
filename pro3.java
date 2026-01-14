package com.problemsolving;

import java.util.ArrayList;
import java.util.List;


public class pro3 {
	
	public static void negative(int [] arr,int k) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<=arr.length-k; i++) {
			//int sum = 0;
			int currentindex = i;
			for(int j=0; j<k; j++) {
				if(arr[currentindex]<0) {
					list.add(arr[currentindex]);
					
					break;
				}else {
					currentindex++;
				}
				if(j==k-1) {
					list.add(0);
				}
			}
			
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		int [] arr = {12,-1,-7,8,-15,30,58,78};
		int k = 3;
		negative(arr,k);

	}

}

