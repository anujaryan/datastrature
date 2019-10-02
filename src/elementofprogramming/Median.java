package elementofprogramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Anuj Pachauri
 *
2:56:47 pm
 */
public class Median {

	public static void rearrange(List<Integer> list) {

		for (int i = 1; i < list.size(); i++) {

			if ((i % 2 == 0 && list.get(i) > list.get(i - 1)) || (i % 2 != 0 && list.get(i) < list.get(i - 1))) {

				Collections.swap(list, i, i - 1);
			}
			
		}

		list.forEach(x -> System.out.print(x + " "));

	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 1, 3, 5, 6, 7, 4);
		rearrange(list);

	}
}
