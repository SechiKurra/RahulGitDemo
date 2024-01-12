package sdet;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String str1, String str2) {
		
		if (str1.length()!=str2.length()) {
			return false;
		}
		char[] s1= str1.toCharArray();
		char[] s2= str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		return Arrays.equals(s1, s2);
		
		
	}
	
	
	public static void main(String[] args) {
		String s1="sweet";
		String s2= "twees1";
		boolean b = isAnagram(s1,s2);
		if (isAnagram(s1,s2)) 
			System.out.println("The two strings are anagram to each other");
		else
			System.out.println("The two strings are not anagram to each other");
		}

	}


