/**
25-Aug-2019
Anuj Pachauri

 * 
 */
package string;

/**
 * @author Anuj Pachauri
 *
 *         1:12:33 pm
 */
public class RepeatedStringMatch {

	public static int repeatedMatch(String A, String B) {

		int la = A.length();
		int lb = B.length();
		StringBuffer sb = new StringBuffer();

		for (int i = 1; i <= Math.max(la / lb + 2, lb / la + 2); i++) {

			sb.append(A);

			if (sb.toString().contains(B))
				return i;

		}

		return -1;
	}

	public static void main(String args[]) {

		String A = "abcd", B = "cdabcdab";

		System.out.println("RepeatedMatch : " + repeatedMatch(A, B));
	}
}
