package infosyspriparationday11;

import java.util.*;

public class Main1 {
	
	 public static int search(Node node,int key){

	        int c = 0;

	        if(node.val!= key){

	            c ++;

	            if(node.val > key){

	                c+=search(node.left,key);

	            }else{

	                c+=search(node.right,key);

	            }

	        }

	            

	        return c;

	    }

	    public static Node insert(Node node,int val){

	        if(node == null){

	            node = new Node(val);

	            return node;

	        }

	        else{

	            if(node.val > val){

	                node.left = insert(node.left,val);

	            }else{

	                node.right = insert(node.right,val);

	            }

	        }

	        return node;

	    }

	    public static void main(String[] args){

	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        Node node = null;

	        for(int i =0;i<n;i++){

	            int val = sc.nextInt();

	            node = insert(node , val);

	        }  

	        int key1 = sc.nextInt();

	        int key2 = sc.nextInt();

	        int count = 0;

	        count += search(node ,key1);  

	        count += search(node ,key2); 

	        System.out.println(count);

	    }

	}


	class Node{

	    int val;

	    Node left;

	    Node right;



	    public Node(int val){

	        this.val=val;

	        Node left = null;

	        Node right = null;

	    }

	}



	   