package sdet;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = {3,2,5,6,2,8};
		
		int end= a.length-1;
		int j=0;
		int temp =0;
		while(j<end) {
			temp= a[j];
			a[j]=a[end];
			a[end]=temp;
			j++;
			end--;
		}
	System.out.println(Arrays.toString(a));
		
	}

}
