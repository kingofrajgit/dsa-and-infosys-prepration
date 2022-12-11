package infosyspriparationday18;

import java.util.*;

public class BirthDayCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		String ans = "yes";
		if(s1>s2) {
		ArrayList<String> newsPaper = new ArrayList<>();
		String[] words =  new String[s2];
		for(int i =0;i<s1;i++) {
			newsPaper.add(sc.next());
		}
		for(int i =0;i<s2;i++) {
			String word = sc.next();
			if(!newsPaper.contains(word)) {
				ans = "no";
				break;
			}
		}
		}else {
			ans = "no";
		}
		System.out.println(ans);
		sc.close();
		
	}

}
