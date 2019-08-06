/**
28-Apr-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

import java.util.Stack;

/**
 * @author anuj
 *
 *         6:03:08 PM
 */
public class TowerOfHanoi {

	public static void main(String[] args) {

		int n = 5;
		Tower[] towers = new Tower[n];
		for (int i = 0; i < 3; i++) {
			towers[i] = new Tower(i);
		}
		for (int i = n - 1; i >= 0; i--) {
			towers[0].add(i);
		}
		towers[0].moveDisks(n, towers[2], towers[1]);

	}
}

class Tower {
	private Stack<Integer> disks;
	private int index;

	public Tower(int index) {
		disks = new Stack<Integer>();
		this.index = index;
	}

	public int index() {
		return index;
	}

	public void add(int d) {

		if (!disks.isEmpty() && disks.peek() <= d) {
			System.out.println("Error Placing Disk " + d);
		} else {
			disks.add(d);
		}

	}

	public void moveTopTo(Tower t) {

		int top = disks.peek();
		t.add(top);
		System.out.println("Move Disk " + top + " From " + index() + " to " + t.index());

	}

	public void print() {
		System.out.println("Contents of Tower " + index());

		for (int i = disks.size() - 1; i >= 0; i--) {
			System.out.println("   " + disks.get(i));
		}
	}

	public void moveDisks(int n, Tower destination, Tower buffer) {

		if (n > 0) {

			moveDisks(n - 1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDisks(n - 1, destination, buffer);
		}

	}

}