/*
 * Count of strings that become equal to one of the two strings after one removal
Difficulty Level : Easy
Given two strings str1 and str2, the task is to count all the valid strings. An example of a valid
string is given below:
If str1 = “toy” and str2 = “try”. Then S = “tory” is a valid string because when a single character
is removed from it i.e. S = “tory” = “try” it becomes equal to str1. This property must also be
valid with str2 i.e. S = “tory” = “toy” = str2.
The task is to print the count of all possible valid strings.

Examples:
Input: 
	str = “toy”, str2 = “try”
Output: 2
	The given two words could be obtained from either word “tory” or word “troy”. So output is 2.
	
Input: 
	str1 = “sweet”, str2 = “sheep”
Output: 0

The two given word couldn’t be obtained from the same word by removing one letter.
Approach: Calculate A as a longest common prefix of str1 and str2 and C as a longest common
suffix of str1 and str2. If both the string are equal then 26 * (n + 1) strings are possible.
Otherwise, set count = 0 and l equal to the first index in that is not a part of the common prefix
and r is the rightmost index which is not a part of the common suffix.
Now, if str1[l+1 … r] = str2[l … r-1] then update count = count + 1.
And if str1[l … r-1] = str2[l+1 … r] then update count = count + 1.
Print the count in the end.
Below is the implementation of the approach:

 */
package infosyspriprationday2;

import java.util.*;

public class SingleCharacterRemoveInString {
	public static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "Sheep";// sc.next();
		String str2 = "sweet";// sc.next();

		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] == c2[i]) {
				list.add(c1[i]);
			} else {
				list.add(c1[i]);
				list.add(c2[i]);
			}
		}
		remove(list, c1, c2, list.size(), 0);
		System.out.println(count);

	}

	private static void remove(ArrayList<Character> list, char[] c1, char[] c2, int n, int i) {
		if (i < n - 1) {
			remove(list, c1, c2, n, i + 1);
		}
		ArrayList<Character> list1 = new ArrayList<>();
		list1 = (ArrayList<Character>) list.clone();
		list1.remove(i);
		check(list1, c1, c2);

	}

	private static void check(ArrayList<Character> list1, char[] c1, char[] c2) {
		if (c1.length == list1.size()) {
			String s = new String(c1);
			String s2 = new String(c2);

			if (s.equalsIgnoreCase(list1.toString().replaceAll("[,\\s\\[\\]]", ""))) {
				count++;
			}
			if (s2.equalsIgnoreCase(list1.toString().replaceAll("[,\\s\\[\\]]", ""))) {
				count++;
			}
		}
	}

}
