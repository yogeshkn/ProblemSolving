

import java.util.Scanner;

public class BonAppetite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N and K");
		String[] nandk = sc.nextLine().split(" ");
		String[] costi = sc.nextLine().split(" ");
		int bcharged = sc.nextInt();

		int n = Integer.parseInt(nandk[0]);
		int k = Integer.parseInt(nandk[1]);

		int[] arr = new int[costi.length];

		for (int i = 0; i < costi.length; i++) {
			arr[i] = Integer.parseInt(costi[i]);
		}

		getBonAppetite(n, k, bcharged, arr);

	}

	public static void getBonAppetite(int n, int k, int b, int[] ar) {

		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i != k) {
				sum += ar[i];
			}
		}

		if (b > (sum / 2)) {
			System.out.println(b - (sum / 2));
		} else {
			System.out.println("Bon Appetit");
		}

	}

}
