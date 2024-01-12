package sdet;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {676,45,8,4,83,2};
		int len= a.length;
		int temp=0;
		
		for (int i=0;i<len;i++) 
			for(int j=i; j<len;j++) 
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			
		for(int i:a) {
			System.out.println(i);
		}
		

	}

}
