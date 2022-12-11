package infosyspriparationday21;

import java.util.Scanner;

public class FindByElementNotDivicableByThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0,ans =1; 
		for(int i =0;i<n;i++) {
			if(arr[i]%3 != 0) {
				ans = 1;
				int m = arr[i];
				while(m > 0){
					ans *= m % 10;
					m = m/10;
				}
				if(ans % 2 ==0 && ans > max) {
					max = ans;
					arr[0] = arr[i];
				}
				

			}
		}
		System.out.println(arr[0]);
	}

}
