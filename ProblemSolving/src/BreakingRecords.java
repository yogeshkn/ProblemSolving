

public class BreakingRecords {
	
	public static void main(String[] args) {
		int[] score = {3,4,21,36,10,28,35,5,24,42};
		
		int len = score.length;
		
		int max=score[0]; int min=score[0]; int countMax=0; int countMin=0;
		
		System.out.println(max);
		for (int i=1; i< len ; i++) {
			if (score[i] > max) {
				max = score[i];
				countMax +=1;
			} else if (score[i] < min) {
				min = score[i];
				countMin +=1;
			}
		}
		
		int[] newArr = {countMax,countMin};
		
		System.out.println("Max count :" + countMax);
		System.out.println("Min count :" + countMin);
	}

}
