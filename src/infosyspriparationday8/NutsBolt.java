/*
 * Nuts & Bolts Problem (Lock & Key problem)

Difficulty Level : Easy

Given a set of n nuts of different sizes and n bolts of different sizes. There is a one-one mapping between nuts and bolts. Match nuts and bolts efficiently. 

Constraint: Comparison of a nut to another nut or a bolt to another bolt is not allowed. It means nut can only be compared with bolt and bolt can only be compared with a nut to see which one is bigger/smaller.

Examples: 

Given nuts = ['ab','bc','dd','gg'], bolts = ['AB','GG', 'DD', 'BC'].

Your code should find the matching bolts and nuts.

one of the possible return:

nuts = ['ab','bc','dd','gg'], bolts = ['AB','BC','DD','GG'].

we will tell you the match compare function. If we give you another compare function.

the possible return is the following:

nuts = ['ab','bc','dd','gg'], bolts = ['BC','AA','DD','GG'].

So you must use the compare function that we give to do the sorting.

The order of the nuts or bolts does not matter. You just need to find the matching bolt for each nut.

Input : nuts[] = {'@', '#', '$', '%', '^', '&'}

        bolts[] = {'$', '%', '&', '^', '@', '#'}

Output : Matched nuts and bolts are-

        $ % & ^ @ # 

        $ % & ^ @ #  

Another way of asking this problem is, given a box with locks and keys where one lock can be opened by one key in the box. We need to match the pair.

Traverse the nuts array and create a hashmap

Traverse the bolts array and search for it in hashmap.

If it is found in the hashmap of nuts then this means bolts exist for that nut.
 */
package infosyspriparationday8;

import java.util.*;
public class NutsBolt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// get input dynamically
		/*int n = 6;//sc.nextInt();
		int[] nuts = new int[n];
		int[] bolt = new int[n];
		for(int i =0;i<n;i++) {
			nuts[i]=sc.nextInt();
		}
		for(int i =0;i<n;i++) {
			bolt[i]=sc.nextInt();
		}*/
		
		//static inputs 
		char[] nuts = {'@', '#', '$', '%', '^', '&'};
		char[] bolt = {'$', '%', '&', '^', '@', '#'};
		for(int i =0;i<bolt.length;i++) {
			for(int j=0;j<nuts.length;j++) {
				if(bolt[i]==nuts[j]) {
					char temp = nuts[i];
					nuts[i] = nuts[j];
					nuts[j] = temp;
					break;
				}
			}
		}
		for(int i =0;i<bolt.length;i++) {
			System.out.print(bolt[i]+"  ");
		}
		System.out.println();
		for(int j=0;j<nuts.length;j++) {
			System.out.print(nuts[j]+"  ");
		}
	}

}
