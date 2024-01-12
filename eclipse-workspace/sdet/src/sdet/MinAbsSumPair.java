package sdet;

public class MinAbsSumPair {

	public static void main(String[] args) {
		int[] a= {1, 60, -10, 70, -80, 85};                                                                                                                                                                                                                                                                                                                                                                                  
		
		int n=a.length;
		int min_sum= a[0]+a[1],sum,min_i=0,min_j=1;
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				sum= a[i]+a[j];
				if(Math.abs(sum)<Math.abs(min_sum)) {
					min_sum=sum;
					min_i=i;
					min_j=j;
				}
				
			}
			
			
		}System.out.println("The elements whose Sum is minimum:"+a[min_i]+" and "+a[min_j]+" is "+min_sum);
	}

}
