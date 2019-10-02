/**
30-Aug-2019
Anuj Pachauri

 * 
 */
package array;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anuj Pachauri
 *
 *         12:05:00 am
 */
public class CreateArrayList {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		Element[] ele = { new Element(1), new Element(2), new Element(3) };

		Method method = Element.class.getMethod("doSomething", null);

		List<Element> list = new ArrayList<>(Arrays.asList(ele));
		list.stream().forEach(x -> System.out.println(x.i));

		String str = "1234";
		for (int j = 0; j < str.length(); j++) {

			int k = str.charAt(j);
			System.out.println(k);
		}
		int i = Integer.parseInt(str);
		System.out.println(i);
	}

}

class Element {

	int i;

	Element() {

	}

	Element(int i) {
		this();

		this.i = i;

	}

	Element(int i, int j) {
		this();
		this.i = i;

	}
}