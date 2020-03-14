package grid;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
 *         3:06:18 pm
 */
public class GardenNoAdj {

	public static int[] gardenNoAdj(int N, int[][] paths) {

		// Create a graph
		Map<Integer, Set<Integer>> graph = new HashMap<>();

		// ...via adjacency list

		for (int i = 0; i < N; i++) {
			graph.put(i, new HashSet<>());
		}

		// add the edges

		for (int[] path : paths) {

			int x = path[0] - 1;// Due to 1-based indexing
			int y = path[1] - 1; // Due to 1 based indexing

			// Undirected edge

			graph.get(x).add(y);
			graph.get(y).add(x);

		}

		// Here is our solution vector where res[i] res the color of garden
		// i+1

		int[] res = new int[N];

		// Now graph painting algorith

		// For each garden
		for (int i = 0; i < N; i++) {

			int[] colors = new int[5];// Use 5 instead of 4 so we can easyl

			for (int nei : graph.get(i)) {

				colors[res[nei]] = 1;// Mark the color as used if neightbor has used
			}

			// Now just use a color that has not been used yet

			for (int c = 4; c >= 1; c--) {

				if (colors[c] != 1) {
					res[i] = c;// so let's use that one
				}

			}

		}

		return res;
	}

	public static void main(String[] args) {
		int N = 3;
		int[][] paths = { { 1, 2 }, { 2, 3 }, { 3, 1 } };
		Arrays.stream(gardenNoAdj(N, paths)).forEach(x -> System.out.println(x));
	}

}
