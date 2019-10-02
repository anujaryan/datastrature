package tree;

import java.util.List;

/**
 * @author Anuj Pachauri
 *
1:08:41 am
 */
public class NtreeDepth {

	public int maxDepth(NNode root) {


		if(root==null)
			return 0;
		
		int max = 0;
		for (NNode n : root.children) {
			max = Math.max(max, maxDepth(n) + 1);
		}

		return max;
	}

	public static void main(String[] args) {

	}
}

class NNode {

	public int val;
	public List<NNode> children;

	NNode(int val) {
		this.val = val;
	}
}
