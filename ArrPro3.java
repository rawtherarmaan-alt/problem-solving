package com.problemsolving;

import java.util.ArrayList;
import java.util.List;


public class ArrPro3 {
	public static void reverse(int [] arr) {
		List<Integer> list=new ArrayList<>();
		
		for(int i=arr.length-1;i>=0;i--) {
			
			list.add(arr[i]);
		}
		     
		System.out.println(list);
	}
	public static void main(String[] args) {
		int [] arr = {1,2,3,8,4,5,6};
		reverse(arr);

	}

}
