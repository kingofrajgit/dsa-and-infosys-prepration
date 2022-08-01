package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class AddElement {

	public static void main(String[] args) {

		// Scanner class object created
		Scanner sc = new Scanner(System.in);

		// get array size using Scanner class
		int n = 0;
		System.out.println("enter array size :");
		n = sc.nextInt();

		// array with size declaration
		int[] a = new int[n];

		// getting array element using for loop
		System.out.println("enter array elements");
		for (int index = 0; index < n; index++) {
			a[index] = sc.nextInt();
		}

		// print array elements
		System.out.println("array elements");
		for (int index = 0; index < n; index++) {
			System.out.println(a[index]);
		}

		// Scanner class object closed
		sc.close();

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("odded elements in a array :");
		for (int index = 0; index < n; index++) {
			System.out.println(a[index] + index);
			list.add(a[index] + index);
		}

		System.out.println("odded elements in a Arraylist :");
		for (int ele : list) {
			System.out.println(ele);
		}
	}
}
