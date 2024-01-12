package sdet;

public class nonDupEle {

	public static void main(String[] args) {
		int[] a = {3,4,6,3,5,6,5};
		int len = a.length;
		
		for(int i=0; i<len;i++) {
			int cnt=0;
			for(int j=0;j<len;j++) {
				if (a[i]==a[j]) {
					cnt=cnt+1;
				}
			}
			if(cnt==1) 
				System.out.println(a[i]);
			
	}

}
}