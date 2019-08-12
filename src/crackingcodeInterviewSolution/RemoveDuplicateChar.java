/**
 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author anuj
 *
 *         6:15:00 AM
 */
public class RemoveDuplicateChar {

	public static void removeDuplicateChar(String s) {

		// aabb
		char[] str = s.toCharArray();
		int len = s.length();
		if (s == null)
			return;
		if (len < 2)
			return;

		int tail = 1;

		for (int i = 1; i < tail; ++i) {

			int j;
			for (j = 0; j < tail; ++j) {
				if (str[i] == str[j])
					break;

			}

			if (j == tail) {
				str[tail] = str[i];
				tail++;
			}
		}
		str[tail] = 0;
		System.out.println(new String(str));

	}

	public static void main(String[] args) {

		String str = "aaabb";

		System.out.println("*********** Removing Duplicate char ***********************");

		removeDuplicateChar(str);
	}
}
