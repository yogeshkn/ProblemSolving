

import java.util.HashSet;
import java.util.Set;

public class Find256Days {

	public static void main(String[] args) {
		int year = 2100;

		Set<Integer> leapYear = new HashSet<Integer>();

		String dat = "";

		if (year == 1918) {
			dat = "26.09.".concat(Integer.toString(year));
		} else {

			for (int i = 1700; i <= 2700; i++) {

				if (year < 1918 && i % 4 == 0) {
					leapYear.add(i);
				}

				if ((i % 4 == 0 && !(i % 100 == 0)) || i % 400 == 0) {
					leapYear.add(i);
				}
			}

			if (leapYear.contains(year)) {
				dat = "12.09.".concat(Integer.toString(year));
			} else {
				dat = "13.09.".concat(Integer.toString(year));
			}

		}

		System.out.println(dat);

	}

}
// int nsum=243;
// int lsum = 244;