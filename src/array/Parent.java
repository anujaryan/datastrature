package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anuj Pachauri
 *
 *         10:36:51 pm
 */
public class Parent {

	public void show() {
		System.out.println("Hello..");
	}

	final public static void main(String[] args) {
		Parent p = new Parent();
		p.show();
		List s = new ArrayList();

		List<? super String> list = new ArrayList<>();
	}
}
