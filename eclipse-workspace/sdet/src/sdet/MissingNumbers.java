package sdet;

import java.util.HashSet;

public class MissingNumbers {

	public static void main(String[] args) {
		Integer a[]= {2,4,1,5,7,8,0};
		HashSet<Integer> set= new HashSet<Integer>();
		
		for(int i:a) {
			set.add(i);
		}
		int n= a.length;
		for(int i=0;i<n;i++) 
			if(!set.contains(i)) 
				System.out.println("Missing number "+i);
			
		
		
	}

}
