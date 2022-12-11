package infosyspriparationday11;
import java.util.*;

public class DecriptMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		int max =0,min=0;
		
		max = maxFunc(c1);
		min = minFunc(c1,max);
		System.out.print(max-min+" ");
		print(c1[c1.length-1]);
		
		max = maxFunc(c2);
		min = minFunc(c2,max);
		System.out.print(max-min+" ");
		print(c2[c2.length-1]);
	}

	private static void print(char c) {
		if( c == 's') {
			System.out.print("South"+" ");
		}
		else if(c == 'e') {
			System.out.print("East"+" ");
		}else if(c == 'w'){
			System.out.print("West"+" ");
		}
		else {
			System.out.print("North"+" ");
		}
	}
	
	private static int minFunc(char[] c,int max) {
		int min = max;
		int n = c.length;
		for(int i =0;i<n-1;i++) {
			int count =0;
			for(int j =0;j<n-1;j++) {
				if(c[i]== c[j]) {
					count++;
				}
			}
			min= Math.min(min,count);
		}
		return min; 
	}

	private static int maxFunc(char[] c) {
		int max =0;
		int n = c.length;
		for(int i =0;i<n-1;i++) {
			int count =0;
			for(int j =0;j<n-1;j++) {
				if(c[i]== c[j]) {
					count++;
				}
			}
			max = Math.max(max, count);
		}
		return max;
	}
}