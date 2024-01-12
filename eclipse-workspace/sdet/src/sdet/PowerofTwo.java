package sdet;

public class PowerofTwo {

	public static void main(String[] args) {
		int i=6;
		int j=i;
		int k=1;
		if(i==0) 
			System.out.println("Given integer "+i +" is not power of 2");
			
		while(i>=2) {
			System.out.println(i);
			if(i%2!=0) 
				System.out.println("Given integer "+i +" is not power of 2");
			
			
			i=i/2;
			k=i / 2;
		}
	System.out.println(j+" is 2 power of "+k);
			
		}
	}


