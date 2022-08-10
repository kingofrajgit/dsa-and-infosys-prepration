/*
 * Find the parent node of maximum product Siblings in given Binary Tree

Given a binary tree, the task is to find the node whose children have maximum Sibling product in the given Binary Tree. If there are multiple such nodes, return the node which has the maximum value.

Examples:

Input: Tree:
              4
           /   \
         5     2
      /  \
    3    1
  /  \
6   12
Output: 3
Explanation: For the above tree, the maximum product for the siblings is formed for nodes 6 and 12 which are the children of node 3.

Input: Tree:
                1
             /    \
          3       5
       /  \     /  \
     6    9  4    8
Output: 3
Explanation: For the above tree, the maximum product for the siblings is formed for nodes 6 and 9 which are the children of node 5.
[0:33 pm, 09/08/2022] Gopi Rev: Approach:  level order traversal of the Binary Tree can be used to find the maximum sum of siblings. 
Start level order traversal of the tree from root of the tree.
For each node, check if it has both the child.
If yes, then find the node with maximum product of children and store this node value in a reference variable.
Update the node value in reference variable if any node is found with greater product of children.
If the current node don’t have both children, then skip that node
Return the node value in reference variable, as it contains the node with maximum product of children, or the parent of maximum product siblings.
 */
package infosyspriparationday7;
import java.util.ArrayList;

class Node2{
	
	 int val;
	 Node2 left;
	 Node2 right;
	public Node2(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class LevelOrderTraversal {
	int val ;
	int ans ;
	
	public LevelOrderTraversal(int val, int ans2) {
		this.val=val;
		this.ans=ans2;
	}
	static ArrayList<LevelOrderTraversal> list = new ArrayList<>();
	public static void main(String[] args) {
		 Node2 root = getNode(1);
	        root.left = getNode(3);
	        root.right = getNode(5);
	        root.left.left = getNode(6);
	        root.left.right = getNode(9);
	        root.right.left = getNode(4);
	        root.right.right = getNode(8);
	 
	        maxproduct(root);
	        System.out.println(result());
	}

	private static int result() {
		int max = 0;
		int ans = 0;
		for(LevelOrderTraversal node : list) {
			if(ans < node.ans) {
				ans=node.ans;
				max = node.val;
			}
		}
		
		return max;
	}

	private static void maxproduct(Node2 root) {
		if(root.left!=null) {
			maxproduct(root.left);
			}
			if(root.right!=null) {
				maxproduct(root.right);
			}
		if(root.left!=null && root.right!=null) {
		int ans = root.left.val*root.right.val;
		LevelOrderTraversal nodes = new LevelOrderTraversal(root.val,ans);
		list.add(nodes);
		}		
	}

	private static Node2 getNode(int i) {
		Node2 newNode = new Node2(i);  
		return newNode;
	}

}
