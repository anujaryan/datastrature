/**
28-Aug-2019
Anuj Pachauri

 * 
 */
package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anuj Pachauri
 *
 *         10:37:12 pm
 */
public class GreyCode {

	public static List<Integer> generateGrey(int n) {

		List<Integer> list = new ArrayList<>();

		int mask = 1 << n;
		for (int i = 0; i < mask; i++) {
			list.add(generateNth(i));
		}

		return list;
	}

	public static int generateNth(int num) {
		return num ^ (num / 2); // logic to generate nth gray code sequence. Try it out yourself to know why it
								// works
	}

	public static void main(String[] args) {
		List<Integer> list = generateGrey(4);
		list.stream().forEach(x -> System.out.println(x));

	}
}
