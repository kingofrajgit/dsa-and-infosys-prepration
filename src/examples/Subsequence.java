package examples;

import java.util.*;

public class Subsequence {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
	//String  s = sc.next();
		String s="jeyaraj";
	subSequences(s);

	}

	private static void subSequences(String s) {
//		for(int i = 0 ; i < s.length(); i++ ) {
//			for(int j =i; j <i+1;j++ ) {
//				for(int l =j;l <= i;l++) {
//					System.out.print(s.charAt(l));
//				}
//				System.out.println();
//			}
//		}
		ArrayList<String> c = s.subSequence(0, s.length());
		System.out.println(c);
	}

}
