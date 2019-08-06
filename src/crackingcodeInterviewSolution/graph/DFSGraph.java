/**
04-May-2019
anuj

 * 
 */
package crackingcodeInterviewSolution.graph;

/**
 * @author anuj
 *
 *         4:33:13 PM
 */
public class DFSGraph {

	int size;
	AdjNode arr[];

	DFSGraph(int size) {
		this.size = size;
		arr = new AdjNode[size];
		for (int i = 0; i < size; i++) {
			arr[i] = new AdjNode();
			arr[i].head = null;
		}
	}

}
