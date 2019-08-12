/**
27-Jul-2019
Dell

 * 
 */
package dailycoding;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dell
 *
 *         6:04:15 pm
 */
public class IntegerCache {

	public static void main(String[] args) {

		// Comparable<String> obj = new Object();

		Map<String, Integer> map = new HashMap<>();
		Integer i1 = 127;
		Integer i2 = 127;
		if (i1 == i2) {
			System.out.println("equal..");
		} else {
			System.out.println("Not equals...");
		}
	}
}

class MyObject implements CharSequence {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.CharSequence#length()
	 */
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.CharSequence#charAt(int)
	 */
	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.CharSequence#subSequence(int, int)
	 */
	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

}

interface foo {
	int f = 20;
}