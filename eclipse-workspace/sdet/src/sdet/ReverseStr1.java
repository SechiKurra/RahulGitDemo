package sdet;

public class ReverseStr1 {
	
	public static void reverseStr(String s) {
		// TODO Auto-generated method stub
		


	String temp=""; 
	  StringBuilder sb = new StringBuilder();
	  
	 
	  for(int i=0;i<s.length();i++) 
	  { char ch= s.charAt(i);
	  temp+=ch; 
	  	if (ch==' ' ||i==s.length()-1 ){
		
	  		sb.insert(0,temp+" ");
	  		temp="";
	  	
	  }
	

	 }
	  System.out.println( sb.toString());
}

	public static void main(String[] args) {
		
		String str = "This is a java code";
		String str1 = " Code is for reverse a string of words ";
		 reverseStr(str);
		 reverseStr(str1);

	}

	
}
