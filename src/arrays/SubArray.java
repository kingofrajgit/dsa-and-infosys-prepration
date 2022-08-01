package arrays;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0;i < size ;i++) {
			arr[i] = sc.nextInt();
		}
		
		findSubArrays(size , arr);
	}

	private static void findSubArrays(int size, int[] arr) {
		
		for(int i = 0;i < size ;i++) {
			for(int j = i;j < size ;j++) {
				for(int k = i;k <= j ;k++) {
					System.err.print(arr[k]+" ");
				}
				System.err.println();
			}
		
		}
	}

}
