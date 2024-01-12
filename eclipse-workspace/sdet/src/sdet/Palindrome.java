package sdet;

public class Palindrome {

	public static   String palindrome(String s) {
		
		String temp="";
		
		
		for(int i=s.length()-1;i>=0;i--) {
			temp=temp+ s.charAt(i);
			
		}
		//System.out.println(temp);
		if (s.equals(temp)) {
			System.out.println("String "+ s+" is palindrome");
		}
		else System.out.println("Sring "+ s+" is not palindrome");
		return temp;
	}
	
	public static void main(String[] args) {
		
		String str = "abba";
		String str1="34534";
	String a=	palindrome(str);
	String b= palindrome(str1);
	System.out.println(a);
	System.out.println(b);

	}

}
