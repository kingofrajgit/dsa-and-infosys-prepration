package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class AddPower {

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
		
		ArrayList<Integer> list = new ArrayList<>();
 
		// print array elements
		System.out.println("array elements");
		for (int index = 0; index < n; index++) {
			System.out.println(a[index]);
			list.add(a[index]);
		}

		// Scanner class object closed
		sc.close();


		System.out.println(" elements in a array :");
		for (int index = 0; index < n; index++) {
			int res = (int) (a[index] + Math.pow(2, index));
			System.out.println( res);
			
		}
		
		for (int index = 0; index < n; index++) {
			int res = (int) (list.get(index) + Math.pow(2, index));
			System.out.println(res);
		}
		System.out.println(" elements in a Arraylist :");
		for (int ele : list) {
			System.out.println(ele);
		}

	}

}
