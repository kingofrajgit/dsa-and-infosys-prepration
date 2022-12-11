package infosyspriparationday19;
import java.util.*;
public class FindElementByPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m =sc.nextInt();
		int[] arr = new int[n+m];
		for(int i =0;i<n+m;i++) {
			arr[i] = sc.nextInt();
		}
		int findElement = sc.nextInt();
		Arrays.sort(arr);
		for(int l : arr) {
		System.out.print(l);
		}
		System.out.println();
		System.out.println(arr[findElement-1]);
	}

}
