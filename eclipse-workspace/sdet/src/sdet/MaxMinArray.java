package sdet;

public class MaxMinArray {

	public static void main(String[] args) {
		int[] arr = {3,4,3,6,3,6,9};
		int min = arr[0];
		int l = arr.length-1;
		int max = arr[l];
		
		for(int i=0;i<l;i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
			if (arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println(min +","+max);
				
	}

}
