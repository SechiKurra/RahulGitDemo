package sdet;

import java.util.HashSet;
import java.util.Set;

public class CommonEles {

	public static void main(String[] args) {
		String[] s1= {"Article","in","Geeks","for","Geeks"};
		String[] s2= {"Geeks","for", "Geeks"};
		Set<String> set = new HashSet<>();
		for(int i =0;i<s1.length;i++) 
			for(int j=0; j<s2.length;j++) 
				if(s1[i]==s2[j]) 
					set.add(s1[i]);
					
				
		for(String i:set) {
			System.out.println(i+" ");
		}
		
		//git commit
		

		//git commit on rahulgitdemo

	}

}
