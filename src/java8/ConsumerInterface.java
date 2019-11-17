package java8;

import java.util.function.Consumer;

/**
 * @author Anuj Pachauri
 *
 *         1:08:16 am
 */
public class ConsumerInterface {

	public static void printMessage(String name) {

		System.out.println("Message :" + name);
	}

	public static void printNum(int num) {

		System.out.println("Num :" + num);
	}

	public static void main(String[] args) {

		Consumer<String> con = ConsumerInterface::printMessage;
		con.accept("anuj");

		Consumer<Integer> second = ConsumerInterface::printNum;
		second.accept(10);

	}
}
