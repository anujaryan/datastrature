package grid;

/**
 * @author Anuj Pachauri
 *
10:21:20 pm
 */
public class AreaOfTriangle {

	public double largestTrianlgeArea(int[][] points) {

		int n = points.length;
		double max = 0;
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; ++j) {

				for (int k = j + 1; k < n; ++k) {
					double area = area(points, i, j, k);
					if (area > max) {
						max = area;
					}
				}
			}
		}
		return max;
	}

	/**
	 * @param points
	 * @param i
	 * @param j
	 * @param k
	 * @return
	 */
	private double area(int[][] points, int i, int j, int k) {

		int[] p1 = points[i];
		int[] p2 = points[j];
		int[] p3 = points[k];

		double area = 0;

		area += area(p1, p2);
		area += area(p3, p1);
		area += area(p3, p1);

		return Math.abs(area);
	}

	/**
	 * @param p1
	 * @param p2
	 * @return
	 */
	private double area(int[] p1, int[] p2) {

		int w = p2[0] - p1[0];
		double h = (p1[1] + p2[1] + 200) / 2.0;
		return w * h;
	}

	public static void main(String[] args) {

	}
}
