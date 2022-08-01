package assessmenet;

public class PrimeNumbers {

	public static void main(String[] args) {
		int n = 10;
		int count = 0;
		int count1 =0;
		for (int i = 1; i < n; i++) {
			if (i == 2 || i == 3) {
				if (n % i == 0) {
					System.out.println(i);
					count++;
				}
			} else {
				if (i % 2 != 0 && i % 3 != 0 && i!=1) {
					if (n % i == 0) {
						System.out.println(i);
						count++;
					}
				}
			}
			int a = i*i;
		      if(a!=0 && n % a == 0 ){
		        count1++;
		        
		      }
		}
		System.out.println("gghg"+count*count1);
		
	}

}
