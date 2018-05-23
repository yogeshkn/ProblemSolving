

public class Pallindrome {

	// accca

	public static void getstringtoappend(String name) {
		String name1 = "";

		for (int i = name.length() - 2; i >= 0; i--) {
			name1 = name1 + name.charAt(i);
		}

		System.out.println(name + name1);
	}

	public static void main(String[] args) {
		String name = "acc";
		char[] chararray = name.toCharArray();
		char[] temparray = new char[chararray.length];
		int len = chararray.length;

		for (int i = 0; i < chararray.length; i++) {
			char temp;
			temp = chararray[len - 1];
			temparray[i] = temp;
			len = len - 1;
		}

		boolean check = false;
		for (int j = 0; j < chararray.length; j++) {

			if (temparray[j] != chararray[j]) {
				check = true;
			}
		}

		if (check) {
			System.out.println("The given string is not a pallindrome");

			getstringtoappend(name);

		} else {
			System.out.println("The given String is a pallindrome");
		}

	}

}
