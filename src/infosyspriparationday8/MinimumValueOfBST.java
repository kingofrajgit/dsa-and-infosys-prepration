/*
 * our friends gifted you a lot of things on your birthday, and now it's your turn to give some return

gifts to them. You went to a gift store and decided to buy some Binary Search Trees (BST).

There is no salesperson in the store. So you are supposed to guess the price of a given BST, which is

the minimum value in its nodes.

 

Input Format:

The first line contains 'T', denoting the number of test cases.

For each Test

The first line contains an integer, 'N'.

The second line contains an array 'A' of 'N' space-separated integers, with a positive

integer representing a node and -1 representing a NULL value.

The input array 'A' denotes Level Order traversal of the BST.

(Note that 'N' is not the number of nodes in the BST, only positive integers in 'A'

denote nodes of BST).

 

Output Format:

For each test case, print one integer, denoting the price of a given BST, i.e., minimum

node value in it.

 

Note:

You are not required to print the expected output. It has already been taken care of. Just

implement the function.

Constraints -

1 <= 'T' <= 10

1 <= 'N' <= 1045

1 <= A[i] <= 10*6 or A[i] = -1, i € (1, N)

Note - The sum of 'N' over all test cases does not exceed 2 * 103215.

Time Limit: 1 sec

Sample Input 1:

2

13

5 46 3 -1 -1 7 -26 -1 -1 -1 -1

7

3 -1 0 -1 11 -1 -1

 

Sample Output 1

1

3

For Case 1:

Given input looks like the tree drawn above. It can be seen that the minimum value in the

tree is 1.

For Case 2:   Given input looks like the tree drawn above. It can be seen that the minimum value in the tree is 9.

Sample Input 2:

2

7

20 3 22 -6 -1 -1 -1

15

44 3 50 4 12 -1 -1 -1 -1 10 14 -1 -1 -1 -1

Sample Output 2:

3

4
 */

package infosyspriparationday8;

import java.util.Scanner;

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

public class MinimumValueOfBST {
	
	public static void main(String[] args) {
		
		//Scanner class declaration
		Scanner sc = new Scanner(System.in);
		
		//number of node
		int n = sc.nextInt();
		Node2 node = null;
		
		for(int i =0;i<n;i++) {
			int m = sc.nextInt();
			if(m != -1) {
			node = insert(node,m);
			}
		}
		System.out.println(minimum(node));
		
	}
	private static int minimum(Node2 node) {
		int n=0;
		if(node.left != null) {
			n= minimum(node.left);
		}else {
			n = node.val;
		}
		return n;
	}
	private static Node2 insert(Node2 node2, int val) {
		if(node2 == null) {
			return new Node2(val);
		}
		else {
			if(node2.val > val) {
				node2.left = insert(node2.left,val);
			}else {
				node2.right = insert(node2.right,val);
			}
		}
		return node2;
	}

}
