package sdet;

import java.util.Scanner;

public class FactorialRecursive {
	
	public static int factorialRecursive(int n) {
		if (n<1) {
			return 1;
		}
		else 
			return n*factorialRecursive(n-1);
		
		
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter an integer to find factorial:");
		int n = s.nextInt();
		int m=	factorialRecursive(n);
		System.out.println(m);
		
	}

}
