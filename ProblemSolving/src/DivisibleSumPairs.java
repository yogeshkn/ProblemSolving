

/*You are given an array of n integers,a0,a1....an-1 , and a positive integer ,k . 
Find and print the number of (i,j) pairs where i<j and ai + aj  is divisible by k.*/

public class DivisibleSumPairs {
	
	public static void main(String[] args) {
		
		int n=6; 
		int k=3;
		int[] ar = {1,3,2,6,1,2};
		
		int count=0;
		for (int i=0; i<n; i++) {
			for (int j=0;j<n;j++) {
				if (i!=j && ((ar[i] + ar[j])%k == 0 )) {
					count +=1;
				}
			}
		}
		
		System.out.println("Count :" + count/2); 
		// count returns double matching like (0,1) && (1,0)
		// so divide the count/2 to get distinct sivisble sum pairs
		
	}

}
