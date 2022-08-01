package queue;

import java.util.*;

public class Queue1 {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
			queue.add("raj");
			queue.add("siva");
			queue.add("hari");
			queue.add("mani");
			 
			Iterator tr = queue.iterator();
			
			while(tr.hasNext()) {
				System.out.println(tr.next());
			}
			
	}

}
