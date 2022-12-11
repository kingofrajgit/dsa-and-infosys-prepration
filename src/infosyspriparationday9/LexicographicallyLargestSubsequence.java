package infosyspriparationday9;
import java.util.Arrays;
import java.util.Scanner;

public class LexicographicallyLargestSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		char[] c = str.toCharArray();
		
		Arrays.sort(c);
		fun(c,c.length);
		
		System.out.println(min);

	}

	private static void fun(char[] c, int length) {
		int max = c[length-1];
		int count =0;
		for(int i =0;i<length-1;i++) {
			if(max == c[i]) {
				count++;
			}
		}
		if(count ) {
			
		}
	}

}
//7
//7
//0 1 2 1 5 1 4 5 6 4 2 3 6 3