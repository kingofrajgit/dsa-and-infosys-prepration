package infosyspriparationday11;
import java.util.*;
public class LogofN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 1;
		for(int i =y;i > 0;i=i/2) {
		if(i % 2 ==1) {
			ans = ans*x;
		}

		x = x*x;
		}
		System.out.println(ans);
	}

}
