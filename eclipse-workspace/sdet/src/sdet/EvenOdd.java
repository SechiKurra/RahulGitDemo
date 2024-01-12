package sdet;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter an integer:");
	int i = s.nextInt();
	if(i%2==0) {
		System.out.println(i +" is an even number");
	}
	else
		System.out.println(i +" is an odd number");
	
	}

}
