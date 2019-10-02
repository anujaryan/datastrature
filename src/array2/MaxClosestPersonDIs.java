package array2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Anuj Pachauri
 *
 *         9:47:59 pm
 */
public class MaxClosestPersonDIs {

	public static int maxDistantClosest(int seats[]) {
		int countzero = 0;
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < seats.length; i++) {

			if (seats[i] == 1) {
				list.add(countzero);
				countzero = 0;
			} else {
				countzero++;
			}

		}
		list.add(countzero);
		int i = Collections.max(list);
		if (seats[seats.length - 1] == 0) {
			return i;
		} else {
			return i - 1;
		}

	}

	public static int maxDistantClosestOther(int seats[]) {

		int max = 0, i = 0, n = 0;

		while (seats[i++] == 0)
			max += 2;

		while (i < seats.length) {

			if (seats[i] == 0)
				n++;
			else {
				max = Math.max(n, max);
				n = 0;
			}
			i++;
		}

		return Math.max(n, (max + 1) / 2);
	}

	public static void main(String[] args) {

		int seats[] = { 1, 0, 0, 0, 1, 0, 1 };

		int seats1[] = { 1, 0, 0, 0, 1, 0, 0, 0 };
		int[] seats2 = { 1, 0, 1 };
		int[] seats3 = { 1, 0 };
		System.out.println(maxDistantClosest(seats));

		System.out.println(maxDistantClosest(seats1));
		System.out.println(maxDistantClosest(seats2));
		System.out.println(maxDistantClosest(seats3));

		System.out.println(maxDistantClosestOther(seats));

		System.out.println(maxDistantClosestOther(seats1));
		System.out.println(maxDistantClosestOther(seats2));
		System.out.println(maxDistantClosestOther(seats3));

	}
}
