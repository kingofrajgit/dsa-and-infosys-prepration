package infosyspriparationday14;

import java.util.Scanner;

public class BinaryTree {
	int val ;
	BinaryTree left;
	BinaryTree right;
	
	public BinaryTree(int val) {
		this.val = val;
		this.left = null;
		this.left.right = null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		BinaryTree node = null;
		for(int i =0;i<n;i++) {
			int val = sc.nextInt();
			insert(node,val);
		}
		print(node,"root");

	}

	private static void print(BinaryTree node,String str) {
		if(node != null) {
			System.out.print(str +"="+node.val);
			System.out.print("left"+"="+node.left.val);
			System.out.print("right"+"="+node.left.val);
			
		}
		
	}

	private static BinaryTree insert(BinaryTree node, int val) {
		if(node == null) {
			node = new BinaryTree(val);
		return node;
		}
		if(node.left == null) {
			insert(node.left, val);
		}
		else if(node.right == null) {
			insert(node.right, val);
		}
		else if() {
			insert(node.left, val);
		}
		return node;
	}

}
