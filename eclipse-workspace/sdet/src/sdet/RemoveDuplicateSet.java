package sdet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateSet {

	public static void main(String[] args) {
		String str= "keerthi";
		Set<Character> ch = new HashSet<>();
		
		for(int i =0;i<=str.length()-1;i++) {
			//char chr=str.charAt(i);
			//ch.add(chr);
			ch.add(str.charAt(i));
		
	}
		System.out.println("non duplicate value from "+str+ " is " +ch.toString());
}

}
