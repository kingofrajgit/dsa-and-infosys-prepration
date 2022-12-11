package infosyspriparationday22;
import java.util.*;
public class FindMinimumWeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] nw = new int[n];
		int[] mw = new int[m];
		for(int i =0;i<n;i++) {
			nw[i] = sc.nextInt(); 
		}
		for(int i =0;i<m;i++) {
			mw[i] = sc.nextInt();
		}
		Arrays.sort(nw);
		Arrays.sort(mw);
		System.out.println(Math.abs(nw[0]-mw[0]));
	}

}
