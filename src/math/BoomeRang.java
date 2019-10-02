package math;

/**
 * @author Anuj Pachauri
 *
11:26:08 pm
 */
public class BoomeRang {

	public static boolean isBoomerang(int points[][]) {

	int x1=points[0][0],y1=points[0][1],x2=points[1][0],y2=points[1][1];
		
		int slope = (y2 - y1) / (x2 - x1);

		for (int i = 1; i < points.length - 1; i++) {
			x1 = points[i][0];
			y1 = points[i][1];
			x2 = points[i + 1][0];
			y2 = points[i + 1][1];
			int newSlope = (y2 - y1) / (x2 - x1);
			if (slope != newSlope) {
				return true;
			}
		}
		return false;
	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int aar[][] = { { 1, 1 }, { 2, 2 }, { 3, 3 } };
		isBoomerang(aar);

	}

}
