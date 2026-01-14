package com.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class pro4 {
	public static void countUniqueElements(int [] arr, int k) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length-k+1;i++) {
			int currentIndex = i;
			for(int j=0;j<k;j++) {
				if(!list.contains(arr[currentIndex])) {
					list.add(arr[currentIndex]);
				}else {
					int index = list.indexOf(arr[currentIndex]);
					list.remove(index);
				}
				currentIndex++;
			}
			System.out.print(list.size()+" ");
			list.clear();
		}
	}

	public static void main(String[] args) {
		int [] arr = {1,2,1,3,4,2,3};
		int k = 4;
		countUniqueElements(arr, k);
	}

}

