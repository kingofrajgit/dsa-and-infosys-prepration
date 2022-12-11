package infosyspriparationday18;

import java.util.*;

public class MlaProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//number of MLAs
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for(int i =0;i<m;i++) {
			String str = String.valueOf(sc.nextInt())+String.valueOf(sc.nextInt());
			list.add(str);
		}
		for(int i =0;i<list.size();i++) {
			for(int j=i;j<list.size();j++) {
				if(i!=j && list.get(i).charAt(0) == list.get(j).charAt(0)) {
					String str1 = Character.toString(list.get(i).charAt(1));
					String str2 = Character.toString(list.get(j).charAt(1));
					list.add(str1+str2);
				}
			}
		}
		int min = list.size();
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				String str1 = String.valueOf(i)+String.valueOf(j);
				String str2 = String.valueOf(j)+String.valueOf(i);
				if(!list.contains(str1) && !list.contains(str2) && i!=j) {
					list.add(str1);
				}
			}
		}
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.size()-min);
	}

}
