/**
29-Jul-2019
Dell

 * 
 */
package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Dell
 *
 *         10:53:06 pm
 */
public class PascalTriangle {

	public static List<Integer> generateKth(int k) {

		List<Integer> sublist = new ArrayList<>();

		Integer temp[] = new Integer[k];
		temp[0] = 1;
		temp[k - 1] = 1;

		for (int j = 1; j < temp.length - 1; j++) {

			temp[j] = temp[j + 1] + temp[j - 1];

		}
		sublist = Arrays.asList(temp);

		return sublist;

	}

	public static List<List<Integer>> generateTriangle(int numsRow) {

		List<List<Integer>> pascal = new ArrayList<List<Integer>>();
		List<Integer> list = null;
		for (int i = 1; i <= numsRow; i++) {

			Integer[] temp = new Integer[i];
			temp[0] = 1;
			temp[i - 1] = 1;
			list = new ArrayList<>();
			if (temp.length == 1 || temp.length == 2) {
				list = Arrays.asList(temp);
				pascal.add(list);
			} else {

				for (int j = 1; j < temp.length - 1; j++) {
					list = pascal.get(i - 2);
					temp[j] = list.get(j) + list.get(j - 1);

				}
				list = Arrays.asList(temp);
				pascal.add(list);
			}
		}

		return pascal;
	}

	public static void main(String[] args) {

//		List<Integer> list = MasterData.getIntegerList();
//		System.out.println(list.get(0));

		for (List<Integer> list : generateTriangle(5)) {

			list.stream().forEach(item -> System.out.print(item + " "));
			System.out.println();

		}

		List<Integer> list = generateKth(4);
		list.stream().forEach(item -> System.out.print(item + " "));
		System.out.println();

	}

}
