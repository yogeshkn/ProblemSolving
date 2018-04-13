

// The first kangaroo starts at location x1  and moves at a rate of v1 meters per jump.

//The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
/*Complete the function kangaroo which takes starting location and speed of both kangaroos as input, 
and return  or  appropriately. Can you determine if the kangaroos will ever land at the same location at 
		the same time? The two kangaroos must land at the same location after making the same number of jumps.
*/

// 4523 8092  yes
// 9419 8076
public class KangrooJump {

	public static void main(String[] args) {
		int x1 = 0;
		int v1 = 2;
		int x2 = 5;
		int v2 = 3;

		int k1 = x1, k2 = x2;

		String retstmt = "NO";

		if (k2 > k1 && v2 > v1) {
			retstmt = "NO";
		} else {

			
			
			for (int i=0; i<10000; i++) {
				if (k1 == k2) {
					retstmt = "YES";
					break;
				} else {
					k1 = k1 + v1;
					k2 = k2 + v2;					
				}
			}
			
			/*do {
				

			} while (k1 != k2 && k1 <= 10000 && k2 <= 10000 && v1 <= 10000 && v2 <= 10000);

			if (k1 == k2) {
				retstmt = "YES";
			}*/

		}

	}

}
