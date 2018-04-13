

/*Lily has a chocolate bar consisting of a row of n squares where each square has an integer written on it. 
She wants to share it with Ron for his birthday, which falls on month m  and day d. Lily wants to give Ron a 
piece of chocolate only if it contains m consecutive squares whose integers sum to d.*/

public class BirthdayChocolate {
	
	public static void main(String[] args) {
		
		int n;	
		int[] s = {1,2,1,3,2};
		int m =2, d=3;
		
		int len = s.length;
		int temp,count=0;
		for (int i=0; i<len-m+1; i++) { //// Biggest logic i < len-m+1
			temp =0;
			for (int j=i; j<(i+m);j++) {
				temp = temp+s[j];
			}
			if (temp==d) {
				count +=1;
			}
		}
		
		System.out.println("Count :" + count);
		
	}

}
