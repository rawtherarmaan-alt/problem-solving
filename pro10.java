package com.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class pro10 {
	static int counter=0;
   public static void sumWindow(int [] arr, int k,int x) {
	   for(int i = 0; i<arr.length-k+1; i++) {
		   int sum = 0;
		   List<Integer> list = new ArrayList<>();
		   for(int j=i; j<k+i; j++) {
			   sum = sum+arr[j];
			   
			   //System.out.println(sum);
		   }
		  // System.out.println(sum);
		   if(sum>=x) {
              counter++;
			  // System.out.println(sum);
			   for(int z=i; z<k+i;z++) {
				   list.add(arr[z]);
			   }
		   }
		   if(!list.isEmpty())
		      System.out.println(list);
		   
	   }
	   System.out.println();
	   System.out.println(counter);
   }
	public static void main(String[] args) {
		int [] arr = {2,1,5,1,3,2};
		int k = 3;
		int x = 7;
		sumWindow(arr, k, x);
		
	}

}
