package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMaxOdd {
	
	public static void main(String[] args) {
		
		//Scanner class object created 
		Scanner sc = new Scanner(System.in); 
		
		//get array size using Scanner class
		int n = 0;
		System.out.println("enter array size :");
		n = sc.nextInt();
		
		//array with size declaration
		int[] a = new int[n];
		
		//getting array element using for loop
		System.out.println("enter array elements");
		for(int index = 0; index < n; index ++) {
			a[index] = sc.nextInt();
		}
		
		//print array elements
		System.out.println("array elements");
		for(int index = 0; index < n; index ++) {
			System.out.println(a[index]);
		}
		
		//Scanner class object closed
		sc.close();
		
		//array list declaration
		List<Integer> oddNumber = new ArrayList<>();
		
		int count = 0;
		for(int i = 0; i < n; i ++) {
			if(a[i]%2!=0) {
				oddNumber.add(a[i]);
				count +=1;
			}
		}
		int min = oddNumber.get(0);
		int max = oddNumber.get(0);
		System.out.println("find the min and max using foreach loop");
		for(int ele : oddNumber) {
			if( ele < min) {
				min = ele;
			}
			if(ele > min) {
				max = ele;
			}
		}
		System.out.println(" minimun odd number ->"+ min );
		System.out.println(" maximum odd number ->"+ max );
		
		System.out.println("find the min and max using for loop");
		min = oddNumber.get(0);
		max = oddNumber.get(0);
		for(int i = 1; i < count; i ++) {
			if(oddNumber.get(i) < min) {
				min = oddNumber.get(i);
			}
			if(oddNumber.get(i) > min) {
				max = oddNumber.get(i);
			}
		}
		
		System.out.println(" minimun odd number ->"+ min );
		System.out.println(" maximum odd number ->"+ max );
	}
}
