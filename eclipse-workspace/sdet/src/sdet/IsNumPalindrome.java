package sdet;

public class IsNumPalindrome {

	public static void main(String[] args) {
		int i =232;
		int j=i;
		int rev =0;
		while(i!=0) {
		int remainder =i%10;
		rev= rev*10+remainder; 
		i=i/10;
		System.out.println(i);
		}
		
		if(j==rev) 
			System.out.println(j+" is palindrome");
		else
			System.out.println(j+ " is not palindrome");
	}

}
