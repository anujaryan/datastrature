/**
31-Mar-2019
anuj
2019
 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author anuj
 *
 *         5:16:28 PM
 */
public class StringReplaceChar {

	public static void replaceSpaceWithString(String name) {

		int new_lenght = name.length(), num_space = 0;
		char str[] = name.toCharArray();
		int lenght = name.length();
		for (int i = 0; i < lenght; i++) {
			if (str[i] == ' ') {
				num_space++;

			}

		}
		System.out.println(" Number of space ... " + num_space);
		new_lenght = lenght + num_space * 2;
		System.out.println("New Lenght is :" + new_lenght);

		str[new_lenght] = '\0';
		for (int i = lenght - 1; i >= 0; i--) {

			if (str[i] == ' ') {
				str[new_lenght - 1] = '0';
				str[new_lenght - 2] = '2';
				str[new_lenght - 3] = '%';
				new_lenght = new_lenght - 3;
			} else {
				str[new_lenght - 1] = str[i];
				new_lenght = new_lenght - 1;
			}
		}

	}

	public static void main(String[] args) {

		String name = "anu j";
		replaceSpaceWithString(name);
	}

}
