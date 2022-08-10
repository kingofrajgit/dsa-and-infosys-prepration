/*
 * Sorting an array by interchanging adjacent Values 

 

Number of swaps to sort when only adjacent swapping allowed

 

Difficulty Level : Hard

 

Given an array arr[] of non negative integers. We can perform a swap operation on any two adjacent elements in the array. Find the minimum number of swaps needed to sort the array in ascending order. 
Examples : 
Input  : arr[] = {3, 2, 1}
Output : 3
We need to do following swaps
(3, 2), (3, 1) and (1, 2)

 

Input  : arr[] = {1, 20, 6, 4, 5}
Output : 5
 
Logic: using the fact that a number of swaps needed is equal to number of inversions. So we basically need to count inversions in array.
The fact can be established using below observations: 
1.    A sorted array has no inversions. 
2.    An adjacent swap can …
 */
package infosyspriparationday6;

import java.util.*;

public class MinimumNumberOfSwaping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {3,2,1};//{1, 20, 6, 4, 5};
		int count = 0;
		for(int i =0;i<a.length;i++) {
			for(int j =i;j<a.length;j++) {
				if(a[i]>a[j]) {
					count ++;
				}
			}
		}
		System.out.println(count);
	}
}
