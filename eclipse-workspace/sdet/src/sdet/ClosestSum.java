package sdet;

public class ClosestSum {

	public static void main(String[] args) {
		int[] a={ 10, 22, 28, 29, 30, 40 };
		int temp= Integer.MAX_VALUE,close_i=0, close_j=1, x=54, n=a.length;
		
		for (int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(Math.abs(a[i]+a[j]-x)<temp) {
					close_i=i;
					close_j=j;
					temp = Math.abs(a[i]+a[j]-x);
				}
			}
		}System.out.println("The closest pair for "+x+" is "+a[close_i]+" "+a[close_j]);
		
	}

}
