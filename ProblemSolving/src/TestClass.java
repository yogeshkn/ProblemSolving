

import java.util.ArrayList;
import java.util.List;

public class TestClass {
	
	
/*	 Buying Show tickets
 * The array input has the number of tickets required for each person standing in the line
 * the variable p denotes the position of the person standing the line.
 * find the time taken so that the person given gets all the tickets:
 * Note : one unit time = i ticket issued
 * Note2 : only one ticket per user. to get another ticket the person needs to stand in the line.
 * */
	
	

	public static void main(String[] args) {
		int[] tickets = { 1,1,1,1,1 };

		int p = 0;

		List<Integer> tick = new ArrayList<Integer>();

		long count = 0;

		int len = tickets.length;


		for (int i = 0; i < len; i++) {
			tick.add(tickets[i]);
		}

		System.out.println(tick);

		
		
		//for (int z = 1; z <p; z++) {
		int z =0;
		while (z<=p) {
		
		for (int b = 0; b < tick.size(); b++) {
				if (tick.get(p) != 0) {
					if (tick.get(b) != 0) {
						tick.set(b, tick.get(b) - 1);
						count += 1;
						z +=1;
					}
				}
			}
		}

		//}
		
		
		System.out.println(count);

	}
}
