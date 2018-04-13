

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Given the price lists for the store's keyboards and USB drives, find and print the amount of money Monica will spend. 
If she doesn't have enough money to buy one keyboard and one USB drive, print -1 instead
*/

/*Monica wants to buy exactly one keyboard and one USB drive from her favorite electronics store. 
The store sells n different brands of keyboards and  different brands of USB drives. Monica has exactly s dollars to spend,
and she wants to spend as much of it as possible (i.e., the total cost of her purchase must be maximal).*/
public class ElectronicShop {
	
	
	public static void main(String[] args) {
		int[] keyboards = {3,1};
		int[] drives = {5,2,8};
		int s = 10; // amount Monica has
		
		int k = keyboards.length;
		int d = drives.length;
		
		List<Integer> pairlst = new ArrayList<Integer>();
		
		for (int i =0; i<k; i++) {
			for (int j = 0; j<d; j++) {
				pairlst.add(keyboards[i] + drives[j]);
			}
		}
		
		Collections.sort(pairlst);
		
		int price =0;
		
		for (int j =0; j<pairlst.size(); j++) {
			if (pairlst.get(j) <= s) {
				price = pairlst.get(j);
			}
			
			if (price ==0  && pairlst.get(j) > s) {
				price = -1;
			}
		}
		
		System.out.println(price);
		
		
	}

}
