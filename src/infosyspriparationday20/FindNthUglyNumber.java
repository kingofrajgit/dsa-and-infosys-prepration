package infosyspriparationday20;
import java.util.*;
public class FindNthUglyNumber {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int[] a = new int[4];
		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		a[3] = 5;
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		int l=1;
		while(list.size() <= n*2) {
			int size=list.size();
			for(int k=0;k<4;k++) {
				for(int i=l;i<size;i++) {
					if(!list.contains(list.get(i)*a[k])) {
						list.add(list.get(i)*a[k]);
					}
				}
			}
			l= size;
		}
System.out.println(list);
System.out.println(list.get(n-1));
Collections.sort(list);
		System.out.println(list.get(n-1));
	}
}
