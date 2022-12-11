/*
 * Length of the longest increasing subsequence which does not contain a given sequence as Subarray
Difficulty Level : Medium

Given two arrays arr[] and arr1[] of lengths N and M respectively, the task is to find the longest increasing subsequence of array arr[] such that it does not contain array arr1[] as subarray.

Examples:

Input: arr[] = {5, 3, 9, 3, 4, 7}, arr1[] = {3, 3, 7}
Output: 4
Explanation: Required longest increasing subsequence is {3, 3, 4, 7}.

Input: arr[] = {1, 2, 3}, arr1[] = {1, 2, 3}
Output: 2
Explanation: Required longest increasing subsequence is {1, 2}.

Input: arr[] = {2,4,6,8,10,12}, arr1[] = {6,8}
Output: 5


The simplest approach is to generate all possible subsequences of the given array and print the length of the longest subsequence among them, which does not contain arr1[] as subarray.

 */
package infosyspriparationday9;

import java.util.*;

public class Lis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int m = sc.nextInt();
		int[] sub = new int[m];
		ArrayList<> 
		for(int i =0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i =0;i<m;i++) {
			sub[i] = sc.nextInt();
		}
		
	}
}
