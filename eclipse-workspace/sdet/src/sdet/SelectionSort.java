package sdet;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {676,45,8,4,83,2};
		int len = a.length;
		
		for (int i=1; i<len-1;i++) {
			int temp = a[i];
			//int j = i-1;
			for(int j=i+1;j<len-1;j++){
				if(a[j]<temp) {
					temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
for(int i:a) {
	System.out.println(i);
}
	}

}
