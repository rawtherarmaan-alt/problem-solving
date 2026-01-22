package com.problemsolving;

public class pro8 {
		public static void minmaxSum(int[] arr, int k) {
			
			
			for(int i=0; i<=arr.length-k;i++) {
//				int sum = 0;
//				int currentIndex = i;
				int minValue = arr[i] ;
				int maxValue = arr[i];
		
				for(int j=i; j<i+k; j++) {
					if(arr[j]>maxValue)
						maxValue = arr[j];
							
					 
					if(arr[j]<minValue) {
						minValue = arr[j];
					      
					}
				}
				System.out.println(minValue);
				System.out.println(maxValue);
			}
			
		}
	
	public static void main(String[] args) {
		int [] arr = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		minmaxSum(arr,k);
		
		
	}

}
