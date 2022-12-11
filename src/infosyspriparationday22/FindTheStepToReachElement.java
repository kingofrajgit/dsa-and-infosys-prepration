package infosyspriparationday22;

import java.util.*;

public class FindTheStepToReachElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 1,3,5,8,9,2,6,7,6,8,9
		
			int[] arr = new int[n];// 1,2,3,5,6,7,8,8,9,9
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(findStep(arr,n));
	}
	public static int findStep(int[] arr,int n) {
		if (n == 0) {
			return -1;
		}
		int step = 1, i = arr[0];
		do  {
			i += arr[i];
			step += 1;
		}while(i <= n);
		if (i >= n) {
			return step;
		} else {
			return -1;
		}
	}
}
