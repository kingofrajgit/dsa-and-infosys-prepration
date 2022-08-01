package examples;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueSubstring {
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the String :");
//		sc.close();
//		String string = sc.next();
		
		case1();
		case2();
		
	}

	private static void case2() {
		System.out.print(unique("A@bcd1abx"));
		
	}

	private static void case1() {
		System.out.print(unique("Ajhfvds2Adde"));
	}

	private static String unique(String string) {
		HashSet<Character> set = new HashSet<>();
		for(int i =0 ;i < string.length();i++) {
			for(int l =i;l<=2;l++ ) {
				for(int k =i;k<l;k++ ) {
				System.out.print(string.charAt(k));
				}
				System.out.println();
			}
		}
		return "null";
	}

}
