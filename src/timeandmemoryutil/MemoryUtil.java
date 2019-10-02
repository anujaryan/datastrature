/**
10-Aug-2019
Dell

 * 
 */
package timeandmemoryutil;

/**
 * @author Dell
 *
 *         8:56:16 pm
 */
public class MemoryUtil {

	private MemoryUtil() {

	}

	public static long beforeMemory() {

		return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

	}

	public static long afterMemory() {

		return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

	}

	public static void main(String[] args) {

		System.out.println(Runtime.getRuntime().freeMemory() / 1000000);
		System.out.println(Runtime.getRuntime().availableProcessors());

	}
}
