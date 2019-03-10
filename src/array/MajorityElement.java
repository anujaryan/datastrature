package array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author anuj Find majority element in an array (Boyer–Moore majority vote
 *         algorithm)
 *
 */
public class MajorityElement {

	// naive solution which take time complexity is o(n2)

	public static int findNaiveMajority(int arr[]) {

		int n = arr.length;
		if (n == 0) {
			return -1;
		}

		for (int i = 0; i < n / 2; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count > n / 2) {
				return arr[i];
			}
		}

		return -1;
	}

	// experience method time compexity o(n) and auxilary space o(n)
	static int mapMajorityElement(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (map.get(arr[i]) == null) {
				map.put(arr[i], 0);
			}

			map.put(arr[i], map.get(arr[i]) + 1);
		}

		Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer, Integer> pair = itr.next();
			System.out.println("key :" + pair.getKey() + "  value is " + pair.getValue());

			if (pair.getValue() > arr.length / 2)
				return pair.getKey();

			itr.remove();

		}
		return -1;

	}

	static int boyerMooreMajorityAlgo(int arr[]) {
		int m = 0;
		int i = 0;
		for (int j = 0; j < arr.length; j++) {

			if (i == 0) {
				m = arr[j];
				i++;
			} else if (m == arr[j]) {
				i++;
			} else {
				i--;
			}
		}
		return m;

	}

	public static void main(String[] args) {
		int arr[] = { 2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2 };
		System.out.println("Majority element is :" + findNaiveMajority(arr));
		// through hashmap........

		int res = mapMajorityElement(arr);
		int bres = boyerMooreMajorityAlgo(arr);
		if (res != -1) {
			System.out.println("Majority element is " + res);
		} else {
			System.out.println("Majority element does not exist..");
		}

		if (bres != -1) {
			System.out.println(" Boyer moore Majority element is " + res);
		} else {
			System.out.println(" Boyer moore Majority element does not exist..");
		}

	}

}
