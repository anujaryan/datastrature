package math;

/**
 * @author Anuj Pachauri
 *
11:25:57 pm
 */
public class DistributeCandies {

	public int[] distributeCandies(int candies, int num_people) {

		int dcandies[] = new int[num_people];

		int temp = 1;
		int counter = 0;

		while (candies > 0) {

			if (counter + 1 > num_people) {
				counter = 0;
			}

			if (temp > candies) {
				dcandies[counter] += candies;
			} else {
				dcandies[counter] += temp;
			}

			candies = candies - temp;
			counter++;
			temp++;

		}

		return dcandies;
	}

	public static void main(String[] args) {

		int candies = 7;
		int num_people = 4;
	}
}
