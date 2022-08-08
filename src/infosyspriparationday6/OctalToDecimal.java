package infosyspriparationday6;
import java.util.*;

public class OctalToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		System.out.println( Integer.parseInt(n,8));
		fun(n);
		 
	}

	private static void fun(String n) {
		int res = 0;
		int j =0;
		for(int i =n.length()-1; i >= 0;i--) {
			res += Character.getNumericValue(n.charAt(i))*Math.pow(8, j);
			System.out.println(res+ " "+Character.getNumericValue(n.charAt(i)));
			j++;
		}
		System.out.println(res);
		
	}

}
