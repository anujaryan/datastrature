/**
09-Aug-2019
Dell

 * 
 */
package string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dell
 *
 *         9:54:25 pm
 */
public class FirstRecuringChar {

	public static void main(String[] args) {

		String message = "acbbac";

		String message1 = "acbde";
		Character ret = firstRecuringChar(message1);

		System.out.println("First Recuring Character :" + ret);
	}

	/**
	 * @param message
	 * @return
	 */
	private static Character firstRecuringChar(String message) {

		Set<Character> set = new HashSet<>();

		Character ret = null;

		for (int i = 0; i < message.length(); i++) {

			if (set.contains(message.charAt(i))) {
				ret = message.charAt(i);
				break;

			} else {
				set.add(message.charAt(i));
			}

		}

		return ret;
	}
}
