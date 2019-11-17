package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Anuj Pachauri
 *
 *         8:55:47 pm
 */
public class RearranceArray {

	public static void main(String str[]) {

		Integer arr[] = { 2, 4, 7, 11, 1, 9 };

		List<Integer> list = Arrays.asList(arr);

		rearanceArray(list);
	}

	public static void rearanceArray(List<Integer> list) {

		list.stream().forEach(x -> System.out.print(x + " "));
		for (int i = 1; i < list.size() - 1; i++) {

			if (((i % 2) == 0 && list.get(i - 1) > list.get(i)) || ((i % 2) != 0 && list.get(i) > list.get(i - 1))) {
				Collections.swap(list, (i - 1), i);

			}
		}

		list.stream().forEach(x -> System.out.print(x + " "));
	}
}
