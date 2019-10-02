package array2;

/**
 * @author Anuj Pachauri
 *
 *         2:59:18 pm
 */
public class BusStopDistance {

	public static int distanceBetweenBusStop(int[] distance, int start, int destination) {

		int total = 0, travel = 0;

		for (int i = 0; i < distance.length; i++) {

			total += distance[i];
		}

		if (start > destination) {
			start = destination + start;
			destination = start - destination;
			start = start - destination;
		}
		for (int i = start; i < destination; i++) {
			travel += distance[i];
		}

		return Math.min(travel, total - travel);
	}

	public static void main(String[] args) {
		int[] distance = { 1, 2, 3, 4 };
		int start = 0, destination = 1;
		System.out.println(distanceBetweenBusStop(distance, start, destination));

	}
}
