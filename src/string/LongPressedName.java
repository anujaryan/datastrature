/**
03-Sep-2019
Anuj Pachauri

 * 
 */
package string;

/**
 * @author Anuj Pachauri
 *
 *         11:46:12 pm
 */
public class LongPressedName {

	public static boolean isLongPressedName(String name, String typed) {

		if (name == null || typed == null) {
			return false;
		} else if (name.equals(typed)) {
			return true;
		} else if (name.length() > typed.length()) {
			return false;
		}
		for (int i = 0, j = 0; i < name.length(); i++, j++) {
			if (j >= typed.length()) {
				return false;
			}
			if (name.charAt(i) != typed.charAt(j) && (i == 0 || typed.charAt(j) != typed.charAt(j - 1))) {
				return false;
			} else if (name.charAt(i) != typed.charAt(j)) {
				i--;
			}
		}

		return true;

	}

	public static void main(String args[]) {
		String name = "alex", typed = "aaleex";
		System.out.println("Long Pressed : " + isLongPressedName(name, typed));
	}
}
