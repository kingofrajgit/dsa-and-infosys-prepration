package examples;
import java.util.Scanner;
public class TowersOfHenoi {
	
	public static int count = 0;
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		//getting number of disk
		 int n = sc.nextInt();
		 
		 //number of road
		 int from = 1;
		 int to = 2;
		 int aux = 3;
		 
		 System.out.println("count :"+toh(n,from,to,aux));
		 
		 sc.close();
		 
	}

	public static int toh(int n, int from, int to, int aux) {
		
		
		if(n != 0) {
			count+=1;
			toh(n-1,from,aux,to);
	        System.out.println("move disk "+n+" from rod"+from+" to rod"+to);
	       toh(n-1,from,aux,to);
		}
		return count;
//		return 3;
	}

}
