package infosysday1assessment;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		String[] s = {"jeyaraj","arun","jana","Anil"};
		Stack <String> stk = new Stack<>(); 
		for(String str : s) {
			str=str.toLowerCase();
			if(str.startsWith("a")||str.startsWith("e")||str.startsWith("i")||str.startsWith("o")||str.startsWith("u")) {
				stk.add(str);
			}
		}
		String s1 =stk.peek();
		System.out.println(s1);
	}

}
