

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;


public class MigratoryBirds {

	
	
	
	public static void main(String[] args) {
		
		
		
		Integer[] ar = {1, 4, 4, 4, 4, 5, 5, 2,2,2,1,1};
		int n = ar.length;
		

		int[] countlst = new int[n];
	
		List<Integer> lst = Arrays.asList(ar);
		
				
		int count1=0,count2=0,count3=0,count4=0,count5=0;	
		
		for (Integer ele : lst) {
			if (ele ==1) {
				count1 +=1;
			} else if (ele ==2) {
				count2 +=1;
			} else if (ele ==3) {
				count3 +=1;
			} else if (ele ==4) {
				count4 +=1;
			} else if (ele ==5) {
				count5 +=1;
			}
		}
		
	
		
		countlst[0] = count1;
		countlst[1] = count2;
		countlst[2] = count3;
		countlst[3] = count4;
		countlst[4] = count5;
		
		int highest = 0;
		int type = 0;
		
		for (int i= 0; i<n; i++) {
			if (countlst[i] > highest) {
				highest = countlst[i];
				type =i;
			}
		}
		
		
		System.out.println("Type : " + type);
		System.out.println("highes :" + highest);
		
	}

	
	

}
