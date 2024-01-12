package sdet;

public class SecondMaxMinArray {

	public static void main(String[] args) {
		int[] a= {3,456,5,8,46,666};
		int len = a.length-1;
		int temp=0;
		
		for (int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if (a[j]<a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second samllest number in the array "+a[1]);
		System.out.println("Second largest number in the array "+a[len-1]);

	}

}
