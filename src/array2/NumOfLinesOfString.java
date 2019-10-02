package array2;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
1:28:49 am
 */
public class NumOfLinesOfString {

	// Time Complexity of this algo is S.length() as we iterate through S
	// Space Complexity O(1) additional space, as we only use line and width
	public static int[] numOfLines(int[] widths, String S) {

		int lines = 1, width = 0;
		for (int i = 0; i < S.length(); i++) {
			int w = widths[S.charAt(i) - 'a'];
			width += w;
			if (width > 100) {

				lines++;
				width = w;
			}

			}

		return new int[] { lines, width };
	}

	public static void main(String[] args) {

		int[] widths = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10 };
		String S = "abcdefghijklmnopqrstuvwxyz";
		int[] widths1 = { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10 };
		String S1 = "bbbcccdddaaa";
		
		Arrays.stream(numOfLines(widths, S)).forEach(System.out::println);
		Arrays.stream(numOfLines(widths1, S1)).forEach(System.out::println);
	}
}
