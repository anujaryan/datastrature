/**
26-Jun-2019
Dell

 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author Anuj
 *
 *         10:17:51 pm
 */
public class ReverseStringRecursion {

	public static String reverse(String name) {

		if (name.isEmpty()) {
			return "";
		} else {
			return reverse(name.substring(1)) + name.charAt(0);
		}

	}

	public static void main(String args[]) {

		String name = "anuj";
		System.out.println("Reverse String is :" + reverse(name));
		System.out.println(name.substring(1));

	}
}
