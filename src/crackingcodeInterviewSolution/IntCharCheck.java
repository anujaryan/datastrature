/**
 * $(date) 
 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author anuj
 *
 *         4:57:59 PM
 */
public class IntCharCheck {

	public static void main(String[] args) {

		String name = "anujaa";
		int[] arr = new int[255];

		int num_unique = 0;
		for (char c : name.toCharArray()) {

			if (arr[c] == 0)
				++num_unique;
			++arr[c];
			System.out.println(arr[c]);
		}
		// System.out.println(num_unique);
	}

}
