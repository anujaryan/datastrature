/**
03-Sep-2019
Anuj Pachauri

 * 
 */
package string;

/**
 * @author Anuj Pachauri
 *
 *         10:24:56 pm
 */
public class GoatLatin {

	public static void main(String str[]) {

		String s = "I speak Goat Latin";

		System.out.println(" Goat Latin String : " + toGoatString(s));
	}

	private static String toGoatString(String s) {
		String c;
		String str[] = s.split(" ");
		String[] goat = new String[str.length];
		int counter = 0;
		for (int i = 0; i < str.length; i++) {
			counter++;
			String word = str[i];
			for (int j = 0; j < word.length(); j++) {
				if (word.substring(0, 1).equalsIgnoreCase("a") || word.substring(0, 1).equalsIgnoreCase("e")
						|| word.substring(0, 1).equalsIgnoreCase("i") || word.substring(0, 1).equalsIgnoreCase("o")
						|| word.substring(0, 1).equalsIgnoreCase("u")) {
					c = word + "ma";
					goat[i] = appenda(c, counter);
				} else {

					char chr = word.charAt(0);
					c = word.substring(1);
					c = c + String.valueOf(chr);
					c = c + "ma";
					goat[i] = appenda(c, counter);
				}
			}

		}

		String goatStr = "";
		for (int i = 0; i < goat.length; i++) {
			goatStr = goatStr + goat[i] + " ";
		}

		return goatStr;
	}

	public static String appenda(String str, int counter) {
		for (int i = 0; i < counter; i++) {
			str = str + "a";
		}
		return str;
	}
}
