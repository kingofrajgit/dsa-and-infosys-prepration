package infosyspriparationday22;

import java.util.*;

class Node {
	int val;
	Node left;
	Node right;

	public Node(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class MaximumProductOfParent { // 7402627217

	static int count;
	static int ele = 0;
	static int max = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node node = null;
		if (n != 0) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int pos = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] != -1) {
					node = new Node(arr[i]);
					pos = i + 1;
					break;
				}
			}

			for (int i = pos; i < n; i++) {
				if (arr[i - 1] != -1 && arr[i] != -1) {
					node = insertLeft(node, arr[i]);
				} else if (arr[i] != -1) {
					count = 0;
					node = insertRight(node, arr[i]);
				}
			}
			print(node);
			System.out.println(ele);
		} else {
			System.out.println(-1);
		}
	}

	private static void print(Node node) {
		if(node.left != null && node.right != null) {
			int ans = node.left.val * node.right.val;
			if(max < ans) {
				max = ans;
				ele = node.val;
			}
		}
		
		if (node.left != null) {
			print(node.left);
		}
		if (node.right != null) {
			print(node.right);
		}

	}

	private static Node insertLeft(Node node, int val) {
		if (node == null) {
			node = new Node(val);
			return node;
		}
		if (node.right != null) {
			node.right = insertLeft(node.right, val);
			return node;
		} else {
			node.left = insertLeft(node.left, val);
		}
		return node;
	}
	private static Node insertRight(Node node, int val) {
		if (node.right != null) {
			node.right = insertRight(node.right, val);
		} else if (node.left != null) {
			node.left = insertRight(node.left, val);
			if (node.right == null && count == 0) {

				node.right = new Node(val);
				count++;
			}
		} else {
			return node;
		}
		return node;
	}
}
