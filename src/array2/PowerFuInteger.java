package array2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
 *         7:05:33 pm
 */

/*
 * powerful Integer is bound>=x^i+y^j
 */
public class PowerFuInteger {

	public static List<Integer> powerfulInteger(int x, int y, int bound) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < 18 && Math.pow(x, i) <= bound; i++) {

			for (int j = 0; j < 18 && Math.pow(y, j) <= bound; j++) {

				int val = (int) Math.pow(x, i) + (int) Math.pow(y, j);

				if (val <= bound) {
					set.add(val);
				}

			}

		}

		return new ArrayList(set);

	}

	public static void main(String[] args) {

		int x = 2, y = 3, bound = 10;

		powerfulInteger(x, y, bound).stream().forEach(n -> System.out.println(n));
	}

}
