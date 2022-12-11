package infosyspriparationday21;

import java.util.Scanner;

public class FindingTheMinimumDistanceAfterReplacingElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int l = sc.nextInt();
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			if(min > arr[i] && arr[i] > 0 ) {
				min =  arr[i];
			}
		}
		System.out.println(min);

	}

}
