package infosyspriparationday7;
import java.util.*;
class Node1{
		
		 int val;
		 Node1 ptr;
		public Node1(int val) {
			this.val=val;
			this.ptr=null; 
		}
}

public class LinkedListCycle {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int[] a = {3,2,0,-4};
		ArrayList<Node1> nodes = new ArrayList<>();
		Node1 head = null;
		for(int i=0;i<n;i++) {
			head = insert(head,sc.nextInt());
			nodes.add(head);
		}
		
		int pos = sc.nextInt();
		try {
		nodes.add(head.ptr=(nodes.get(pos)));
		int c = search(nodes,head);
		if(c==0) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		}catch(Exception e){
			System.out.println("false");
		}
	}

	private static int search(ArrayList<Node1> nodes, Node1 head) {
		int count =0;
		for(Node1 node: nodes) {
			if(node==head.ptr) {
				count ++;
			}
		}
		return count;
		
	}

	private static Node1 insert(Node1 head,int val) {
		if(head == null) {
			head = new Node1(val);
			return head;
		}
		else {
			head = insert(head.ptr,val);	
		}
		return head;
	}
}
