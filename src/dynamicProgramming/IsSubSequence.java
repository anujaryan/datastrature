/**
31-Aug-2019
Anuj Pachauri

 * 
 */
package dynamicProgramming;

import timeandmemoryutil.TimeUtils;

/**
 * @author Anuj Pachauri
 *
 *         2:47:46 pm
 */
public class IsSubSequence {

	// Recursive Solution....
	public static boolean isSubSequence(String s, String t) {

		if (s.length() == 0)
			return true;
		if (s.length() == 1)
			return t.contains(s);

		if (s.length() > 1) {

			if (t.contains(s.substring(0, 1))) {
				return isSubSequence(s.substring(1), t.substring(t.indexOf(s.substring(0, 1)) + 1));
			}
		}

		return false;
	}

	// Greedy Approach .................
	public static boolean isSubsequence(String s, String t) {

		if (s.length() == 0)
			return true;
		int ids = 0;

		for (int i = 0; i < t.length(); i++) {

			if (s.charAt(ids) == t.charAt(i)) {
				ids++;
			}

			if (ids == s.length())
				return true;
		}

		return ids == s.length();

	}

	public static void main(String[] args) {

		String s = "ace";
		String t = "abcde";
		long startime = TimeUtils.beforeStartTime();
		System.out.printf("Is s :  %s is subSequence  t:  %s ", s, t + " " + isSubSequence(s, t));

		System.out.printf("Is s :  %s is subSequence  t:  %s ", s, t + " " + isSubsequence(s, t));
		long endtime = TimeUtils.afterEndTime();
		System.out.println("Time taken by algo : " + (endtime - startime) + " ms");

	}
}
