package sdet;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "abab";
		int ind =0;
		char[] ch = str.toCharArray();
		
		for (int i=0; i<str.length();i++) {
			int j;
			
			for(j=0; j<i; j++) {
				//System.out.println("i:"+i+"j:"+j);
			if (ch[i]== ch[j]) {
				break;
			}
			}
			if (i==j) {
				
				ch[ind++]=ch[i];
				//System.out.println(j);
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(ch, ind)));

	}

}
