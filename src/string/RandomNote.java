/**
06-Aug-2019
Dell

 * 
 */
package string;

/**
 * @author Dell
 *
 *         11:00:53 pm
 */
public class RandomNote {

	public static boolean conConstruct(String ransomNote, String magazine) {

		boolean isConstruct = true;

		int counts[] = new int[123];

		for (char c : magazine.toCharArray()) {
			++counts[c];
		}

		for (char c : ransomNote.toCharArray()) {

			if (counts[c] == 0) {
				return isConstruct = false;
			} else {
				counts[c]--;
			}
		}

		return isConstruct;
	}

	public static void main(String[] args) {

		String randomNote = "aa";
		String magazine = "aanujj";
		System.out.println("Can Construct Note : " + conConstruct(randomNote, magazine));

		char[] note = magazine.toCharArray();

		int count[] = new int[123];

		for (char c : note) {
			int ch = ++count[c];
			System.out.println(ch);
		}

		for (char c : randomNote.toCharArray()) {

			if (count[c] == 0) {
				System.out.println("Character not found");
			} else {
				System.out.println("Character found..");
			}
		}

	}

}
