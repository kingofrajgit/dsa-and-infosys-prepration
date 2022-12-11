package infosyspriparationday14;
import java.util.Arrays;
import java.util.*;
public class MaximumProfit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//15,34,67,78,90
		String str = sc.next();
		String[] arr = str.split(",");
		int[] a = new int[arr.length];
		for(int i =0;i<a.length;i++) {
			a[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(a);
		int max = 0,pos = 0;
		for(int i =1;i<=a.length;i++) {
			if(max < a[a.length-i]*i) {
				max = a[a.length-i]*i;
				pos = a.length-i;
			}
		}
		System.out.println(a[pos]);
	}
}