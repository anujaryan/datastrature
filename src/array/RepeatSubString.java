/**
25-Aug-2019
Anuj Pachauri

 * 
 */
package array;

/**
 * @author Anuj Pachauri
 *
 *         12:24:39 pm
 */
public class RepeatSubString {

	public static boolean repeateSubString(String str) {

		if (str.isEmpty() || str == null) {
			return true;
		}

		int mid = str.length() / 2;

		while (mid > 0) {

			if (str.length() / mid == 0) {

				if (repeated(str, str.substring(0, mid))) {
					return true;
				}

			}
			mid--;

		}

		return false;
	}

	/**
	 * @param str
	 * @param substring
	 * @return
	 */
	private static boolean repeated(String str, String substring) {

		if (str.isEmpty() || str == null) {
			return false;
		}

		if (str.length() < substring.length()) {
			return false;
		}

		if (str.equals(substring)) {
			return true;
		}
		if (!str.startsWith(substring)) {
			return false;
		}

		return repeated(str.substring(substring.length()), substring);
	}

	public static boolean repeateSubStringOne(String str) {

		return (str + str).indexOf(str, 1) < str.length();

	}

	public static void main(String args[]) {

		String str = "ababc";
		System.out.println(str.indexOf("ab"));
		// System.out.println(str.startsWith("ab", 0));
		System.out.println(" Repeated SubStrign exist... " + repeateSubStringOne(str));

		System.out.println(" Repeated SubStrign exist... " + repeateSubString(str));

	}
}
