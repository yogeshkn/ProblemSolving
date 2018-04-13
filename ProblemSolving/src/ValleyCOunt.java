

public class ValleyCOunt {

	public static void main(String[] args) {

		String seq = "DDUUDDUDUUUD";
		int n = seq.length();

		char[] charseq = seq.toCharArray();

		int valleycount = 0;

		int lvl = 0;

		for (int i = 0; i < n; i++) {
			if (String.valueOf(charseq[i]).equals("D")) {
				lvl -= 1;

			} else {
				lvl += 1;
			}

			if (lvl == 0 && String.valueOf(charseq[i]).equals("U")) {
				valleycount += 1;
			}

		}

		System.out.println(valleycount);

	}

}
