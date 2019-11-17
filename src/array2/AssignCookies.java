package array2;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         1:59:11 am
 */
public class AssignCookies {

	public static int findContentChildren(int[] g, int[] s) {

		Arrays.sort(g);
		Arrays.sort(s);
		int i = 0;
		for (int j = 0; i < g.length && j < s.length; j++) {
			if (g[i] <= s[j])
				i++;
		}
		return i;
	}

	public static void main(String[] args) {

		int g[] = { 1, 2, 3 };
		int s[] = { 1, 1 };

		int g1[] = { 1, 2 };
		int s1[] = { 1, 2, 3 };

		System.out.println(findContentChildren(g, s));

		System.out.println(findContentChildren(g1, s1));
	}
}
