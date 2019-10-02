/**
11-Aug-2019
Anuj Pachauri

 * 
 */
package java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author Anuj Pachauri
 *
 *         10:51:23 am
 */
public class OptionalTest {

	List<String> list = new ArrayList<>();

	public static Optional<Character> getNonRepeatedCharacter(String str) {

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {

			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);

			}
		}

//		for (Character c : map.keySet()) {  // throwing null pointer exception here
//
//			if (map.get(c) == 1) {
//				return c;
//			}
//		}
//		return null;

		for (Character c : map.keySet()) {

			if (map.get(c) == 1) {
				return Optional.of(c);
			}
		}
		return Optional.ofNullable(null);

	}

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		Optional<Character> c = getNonRepeatedCharacter("SSAASA");

		if (c.isPresent()) {
			System.out.println(c.toString());
		} else {
			System.out.println("No no reapeated character found in String..");
		}

	}
}
