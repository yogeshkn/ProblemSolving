

public class BookNumbers {

	public static void main(String[] args) {
		int n = 6, p = 5;

		int precount = 0, lstcont = 0;

		
		int val = Math.min(p/2, (n/2)-(p/2));
		
		
		/*for (int i = 1; i <= n / 2; i++) {
			if (p == 2 * i || p == ((2 * i) + 1)) {
				precount = i;

			}
		}

		System.out.println(precount);

		for (int j = n; j >0; j--) {
			if (p!=j || p!=j-1) {
				lstcont +=1;
			}
		}*/
		
		System.out.println(val);
	}

}
