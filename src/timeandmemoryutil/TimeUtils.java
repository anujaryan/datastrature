/**
10-Aug-2019
Dell

 * 
 */
package timeandmemoryutil;

/**
 * @author Dell
 *
 *         9:00:51 pm
 */
public class TimeUtils {

	private TimeUtils() {

	}

	public static long beforeStartTime() {

		return System.currentTimeMillis();
	}

	public static long afterEndTime() {

		return System.currentTimeMillis();
	}

	public static void main(String args[]) {

		System.out.println(System.getenv("Path"));

	}
}
