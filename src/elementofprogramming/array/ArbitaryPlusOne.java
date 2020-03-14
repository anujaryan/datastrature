package elementofprogramming.array;



import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author Anuj Pachauri
 *
11:57:06 am
 */
public class ArbitaryPlusOne {

	public static List<Integer> plusOne(List<Integer> list) {

		int n = list.size() - 1;
		list.set(n, list.get(n) + 1);

		for (int i = n; i > 0 && list.get(i) == 10; i--) {

			list.set(i, 0);
			list.set(i - 1, list.get(i - 1) + 1);
		}

		if (list.get(0) == 10) {
			list.set(0, 0);
			list.set(0, 1);
		}

		return list;
	}

	@Test
	public void plusOne_Test() {
		List<Integer> expexted = Arrays.asList(1, 2, 9);
		List<Integer> actuals = Arrays.asList(1, 3, 0);

		assertThat(actuals, is(plusOne(expexted)));

	}
}
