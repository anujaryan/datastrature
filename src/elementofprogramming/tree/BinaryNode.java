package elementofprogramming.tree;

/**
 * @author Anuj Pachauri
 *
3:33:20 pm
 */
public class BinaryNode {

	int data;
	public BinaryNode left, right;

	BinaryNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	static BinaryNode createNode(int data) {
		return new BinaryNode(data);
	}
}
