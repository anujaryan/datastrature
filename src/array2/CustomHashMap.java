package array2;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         10:51:04 pm
 */
public class CustomHashMap {

	int map[];

	public CustomHashMap() {
		map = new int[1000001];
		Arrays.fill(map, -1);
	}

	public int get(int key) {
		return map[key];
	}

	public void put(int key, int value) {
		map[key] = value;
	}

	public void remove(int key) {

		map[key] = -1;
	}

	public static void main(String[] args) {

		CustomHashMap hashMap = new CustomHashMap();
		hashMap.put(1, 1);
		hashMap.put(2, 2);
		System.out.println(hashMap.get(2));

		System.out.println(hashMap.get(3)); // returns -1 (not found)
		hashMap.put(2, 1); // update the existing value
		System.out.println(hashMap.get(2)); // returns 1
		hashMap.remove(2); // remove the mapping for 2
		System.out.println(hashMap.get(2));
	}
}
