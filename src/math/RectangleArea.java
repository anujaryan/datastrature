package math;

/**
 * @author Anuj Pachauri
 *
11:55:10 am
 */
public class RectangleArea {

	public static int[] rectangleArea(int area) {

		int r = (int) Math.sqrt(area);
		
		while (area % r != 0) {
			r--;
		}
		int a[]= {area/r,r};
		return a;

	}

	public static void main(String[] args) {

	}
}
