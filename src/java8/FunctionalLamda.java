package java8;

/**
 * @author Anuj Pachauri
 *
 *         10:47:25 pm
 */
public class FunctionalLamda {

	public static void main(String[] args) {

		Hello h = () -> {
			System.out.println("Hello");
		};

		h.print();
	}
}

//@FunctionalInterface
interface Hello {
	void print();
}
