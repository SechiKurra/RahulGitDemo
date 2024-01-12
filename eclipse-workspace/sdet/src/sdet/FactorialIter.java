package sdet;

import java.util.Scanner;

public class FactorialIter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter an integer to find factorial:");
		int n= s.nextInt();
		int res=1;
		while(n>0) {
			res=res*n;
			n--;
		}
		System.out.println("Factorial of "+n+" is "+res);
	}

}
