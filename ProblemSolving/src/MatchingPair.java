

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MatchingPair {

	public static int sockMerchant(int n, Integer[] ar) {

		List<Integer> lst = Arrays.asList(ar);

		Collections.sort(lst);

		int count = 0;

		for (int i = 0; i < n - 1; i++) {
			if (lst.get(i) == lst.get(i + 1)) {
				count += 1;
				i++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] ar = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = sockMerchant(n, ar);
		System.out.println(result);
	}

}
