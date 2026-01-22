package com.problemsolving;

public class pro9 {
	public static void getMinAverage(int [] arr, int k) {
		double minValue = Double.MAX_VALUE;
		for(int i = 0; i<=arr.length-k;i++) {
			
			double sum = 0;
			//int currentIndex = i;
			for(int j = i; j<k+i;j++) {
				sum = sum+arr[j];
				//currentIndex++;
			}
			double a = (sum/k);
			//System.out.println(a);
			if(minValue>a) {
				minValue = a;
				System.out.println(minValue);
				
				for(int b = i;b<k;b++) {
			    	System.out.print(arr[b]+" ");
			    }
			}
			
		}
		    
	}
	
	public static void main(String[] args) {
		int [] arr = {1,12,-5,-6,50,3};
		int k = 4;
		getMinAverage(arr, k);
		
	}

}
