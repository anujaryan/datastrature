package math;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         12:27:23 am Three stones are on a number line at positions a, b, and
 *         c.
 * 
 *         Each turn, you pick up a stone at an endpoint (ie., either the lowest
 *         or highest position stone), and move it to an unoccupied position
 *         between those endpoints. Formally, let's say the stones are currently
 *         at positions x, y, z with x < y < z. You pick up the stone at either
 *         position x or position z, and move that stone to an integer position
 *         k, with x < k < z and k != y.
 * 
 *         The game ends when you cannot make any more moves, ie. the stones are
 *         in consecutive positions.
 * 
 *         When the game ends, what is the minimum and maximum number of moves
 *         that you could have made? Return the answer as an length 2 array:
 *         answer = [minimum_moves, maximum_moves] Input: a = 1, b = 2, c = 5
 *         Output: [1,2] Explanation: Move the stone from 5 to 3, or move the
 *         stone from 5 to 4 to 3.
 */
public class MovingStones {

	public static int[] numMovesStone(int a, int b, int c) {
		int[] s = { a, b, c };
		Arrays.sort(s);
		if (s[2] - s[0] == 2)
			return new int[] { 0, 0 };
		return new int[] { Math.min(s[1] - s[0], s[2] - s[1]) <= 2 ? 1 : 2, s[2] - s[0] - 2 };
	}

	public static void main(String[] args) {
		int a = 1, b = 2, c = 5;
		Arrays.stream(numMovesStone(a, b, c)).forEach(x -> System.out.println(x));

	}
}
