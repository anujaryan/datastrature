package graph;

/**
 * @author Anuj Pachauri
 *
 *         2:36:14 pm
 */
public class DfsSearch {
	int size;
	AdjNode[] array;

	public DfsSearch(int size) {
		super();
		this.size = size;
		this.array = new AdjNode[size];

		for (int i = 0; i < size; i++) {
			array[i] = new AdjNode();
			array[i].head = null;

		}
	}

	public void add(int src, int dest) {
		Node n = new Node(dest, null);
		n.next = array[src].head;
		array[src].head = n;
	}
}
