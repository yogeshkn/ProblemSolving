

public class Apple__Orange {
	
	public static void main(String[] args) {
		int h1 = 7, h2= 11;
		int a = 5, o= 15;
		int[] aples = {-2,2,1};
		int[] oranges = {5,-6};
		
		
		int m = aples.length;
		int n = oranges.length;
		
		int countm=0, countn=0;
		
		for (int i=0; i<m; i++) {
			if (a+aples[i] >= h1 && a+aples[i] <=h2) {
				countm +=1;
			}
		}
		
		for (int j=0; j<n; j++) {
			
			if (o+oranges[j] <= h2 && o+oranges[j] >=h1) {
				countn +=1;
			}
		}
		
		System.out.println("countm :" + countm );
		System.out.println("countn yOGESH :" + countn );
	}

}
