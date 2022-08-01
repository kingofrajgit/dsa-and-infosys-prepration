package infosys;

/*
 * 3) Get Maximum in Generated Array Leetcode Solution

The problem Get Maximum in Generated Array Leetcode Solution provided us with a single integer. With the given single integer, we need to find the maximum integer in the generated array. The array generation has some rules. Under the imposed co

need to find the maximum integerthat could have been generated. The rules are:

input

n = 7

output

3

Explanation: According to the given rules: nums[0] = 0, nums[1] = 1 nums[(1 * 2) = 2] = nums[1] = 1 nums[(1 * 2) + 1 = 3] = nums[1] + nums[2] = 1 + 1 = 2 nums[(2 * 2) = 4] = nums[2] = 1 nums[(2 * 2) + 1 = 5] = nums[2] + nums[3] = 1 + 2 = 3 nums[(3 * 2) = 6] = nums[3] = 2 nums[(3 * 2) + 1 = 7] = nums[3] + nums[4] = 2 + 1 = 3

So, we can see nums = [0,1,1,2,1,3,2,3], and the maximum is 3 among them. Thus the answer is 3.

Approach for Get Maximum in Generated Array Leetcode Solution

The problem Get Maximum in Generated Array Leetcode Solution has some constraints that must be satisfied. Under the given constraints
*/

import java.util.*;

public class Mca {
	// Maximum in Generated Array
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0, 0);
		list.add(1, 1);
		int i = 0, ans = 0;
		int c = 0;
		for (i = 1; i <= n; i++) {
			ans = i * 2;
			if ((ans) <= n) {
				list.add(ans, list.get(i));
			}
			c = i * 2 + 1;
			if ((c) <= n) {
				list.add(c, (list.get(i) + list.get(i + 1)));
			}
		}
		System.out.println(Collections.max(list));
	}

}
