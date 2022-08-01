package infosysday1;
import java.util.*;

/*
 * n - number of person.
 * m - reduce number of  Kg.
 * array a - number of quantities.
 * find the last person sale for for using last amount of quantity.
 * sample input:
 * 		n=4
 * 		m=2
 * 		a=[7893]
 * 
 * sample output:
 * 		3
 * 		the last person -> 3
 * 
 * ex : [7893],[8935],[9356],[3567] = 4 -> members present.
 * 		[5671],[6713],[7134],[1345] = 4 -> members present.
 * 		[345],[451],[512],[123]		= 4 -> members present.
 * 		[23],[3],[1].				= 3 -> members present.last person was no-> 3
 */

public class BiggestMeatball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		int n = 4;//sc.nextInt();
		int m = 2;//sc.nextInt();
		int[] a = {7,8,9,3};//new int[n];
		
		
//		for(int i=0;i<4;i++) {
//			a[i]=sc.nextInt();
//		}
		int l =4 ;
		int c = 0;
		while( l!=0) {
			//reduce the meatball
			a[0]-=2;
			c++;
			
			System.out.println();
			System.out.print(a[0]);
			
			//rotate counter clock wise in one time 
			int t = a[0];
			for(int i=0;i<l-1;i++) {
				a[i]=a[i+1];
				System.out.print(a[i]);
			}
			a[l-1]=t;
			
			//check the last element is zero .remove the last element and decrease the array size (l--)    
			if(a[l-1]<=0) {
				l--;
			}
			
			//In every one day sellers can work one by one.
			//sellers one time complete the sales process. 
			//re-start the process continuously for the none-zero quantity.
			if(c==n) {
				c=0;
			}
				
		}
		System.out.println();
		System.out.println("the last seller :"+c);

	}

}
