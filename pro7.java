package com.problemsolving;


public class pro7 {
	public static void countVowels(String  str,int k) {
		for(int i=0; i<=str.length()-k; i++) {
//			char b = a.charAt(0);
			int count = 0;
			//int currentindex = i;
//			char a = 'a','e','i','o','u';
			//char d = str.charAt(j);
			for(int j=i; j<k+i; j++) {
				char c = str.charAt(j);
				if( c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					count++;
					
				}
				//currentindex++;
			}
			System.out.print(count+" ");
		}
	}

	public static void main(String[] args) {
		//String [] arr = {"a","b","c","i","i","i","d","e","f"};
		String str = "abciiidef";
		int k = 3;
		countVowels(str,k);
		
	}

}

