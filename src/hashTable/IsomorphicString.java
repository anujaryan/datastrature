/**
12-Aug-2019
Anuj Pachauri

 * 
 */
package hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         10:12:25 pm
 */
public class IsomorphicString {

	public static void main(String[] args) {

		String s = "ega";
		String t = "add";

		System.out.println("Given Strings Isomorphic : " + isIsoMorphic(s, t));
	}

	/**
	 * @param s
	 * @param t
	 * @return
	 */
	private static boolean isIsoMorphic(String s, String t) {

		boolean isIsomorphic = true;

		int len = s.length();

		Map<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < len; i++) {

			char temps = s.charAt(i);
			char tempt = t.charAt(i);

			if (map.containsKey(temps)) {

				char ret = map.get(temps);
				if (ret != tempt) {
					return isIsomorphic = false;
				}

			} else {
				if (map.containsValue(tempt)) {
					return isIsomorphic = false;
				} else {
					map.put(temps, tempt);
				}
			}

		}

		return isIsomorphic;
	}
}
