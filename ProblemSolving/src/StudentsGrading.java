

import java.util.ArrayList;
import java.util.List;

public class StudentsGrading {
	
	public static void main(String[] args) {
		int[] grades = {73,67,38,33};
		
		int len = grades.length;
		List<Integer> ng = new ArrayList<Integer>();
		
		for (int grade: grades) {
			int temp = grade;
			if (temp > 37) {				
				
				for (int i=1 ; i<3; i++) {
					if (temp % 5 !=0) {
						temp +=1;
					} 
				}
				
				if (temp % 5 != 0) {
					temp = grade;
				}
				
				
			} 		
				ng.add(temp);		
		}
		
 		int[] arr = new int[len];
 		for (int j = 0; j<len; j++) {
 			arr[j] = ng.get(j);
 		}
				
	}

}
