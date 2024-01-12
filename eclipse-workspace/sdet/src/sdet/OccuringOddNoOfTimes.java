package sdet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OccuringOddNoOfTimes {
	
	public static void getOddOccurance(int a[], int n) {
		List<Integer> ls= new ArrayList<Integer>();
		
		for (int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(a[i]==a[j]) 
					count++;	
					
			}
			if(count%2!=0) {
				int k= a[i];
				ls.add(k);
			
			}
		}
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(ls);
		System.out.println(set.toString());
		
		
	}

	public static void main(String[] args) {
		int[] a= { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 3};
		int n= a.length;
		
	  	getOddOccurance(a,n);
		
		
	}

}
