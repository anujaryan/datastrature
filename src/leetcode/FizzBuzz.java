package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Anuj Pachauri
 *
 *         9:39:58 pm
 */
public class FizzBuzz {

	public static List<String> fizzBuzz(int n) {

		List<String> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {

			if (i % 15 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {

				list.add("Fizz");

			} else if (i % 5 == 0) {
				list.add("Buzz");

			} else {
				list.add("" + i);
			}

		}

		return list;
	}

	public static void main(String[] args) {

		int n = 15;
		List<String> list = fizzBuzz(n);
		Consumer<String> con = s -> System.out.println(s);
		list.stream().forEach(con);
	}
}
