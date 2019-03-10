package tree;

public class BST {

	Node root;
	int size = 0;

	public BST() {
		super();
		this.root = null;
	}

	public Node createNode(int value) {
		return new Node(value, null, null);
	}

	public void addNode(Node start, Node newNode) {

		if (root == null) {
			root = newNode;
			return;
		}

		if (start.getValue() > newNode.getValue()) {

			if (start.getLeft() == null) {
				size++;
				start.setLeft(newNode);
			}

			addNode(start.getLeft(), newNode);

		}

		if (start.getValue() < newNode.getValue()) {

			if (start.getRight() == null) {
				start.setRight(newNode);
				size++;
			}

			addNode(start.getRight(), newNode);

		}

	}

	public void searchNode(Node start, int value) {

		if (start == null) {
			System.out.println("node is not found !");
			return;
		}

		if (start.getValue() == value) {
			System.out.println("Node found !");
			return;
		}

		if (start.getValue() > value) {
			searchNode(start.getLeft(), value);
		}

		if (start.getValue() < value) {
			searchNode(start.getRight(), value);

		}

	}

}
