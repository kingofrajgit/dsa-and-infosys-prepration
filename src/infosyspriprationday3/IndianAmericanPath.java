/*
 * Question no 2 :
Problem Statement – Nobel Prize-winning Austrian-Irish physicist Erwin Schrödinger developed a machine and brought as many Christopher Columbus from as many parallel universes he could. Actually he was quite amused by the fact that Columbus tried to find India and got America. He planned to dig it further.
Though totally for research purposes, he made a grid of size n X m, and planted some people of America in a position (x,y) [in 1 based indexing of the grid], and then planted you with some of your friends in the (n,m) position of the grid. Now he gathered all the Columbus in 1,1 positions and started a race.
Given the values for n, m, x, y, you have to tell how many different Columbus(s) together will explore you as India for the first time.
Remember, the Columbus who will reach to the people of America, will be thinking that as India and hence wont come further.

Function Description:
Complete the markgame function in the editor below. It has the following parameter(s):
Parameters:
Name Type Description
n Integer The number of rows in the grid.
m Integer The number of columns in the grid.
x Integer The American cell’s Row.
y Integer The American cell’s Column.
Constraints:
1 <= n <= 10^2
1 <= m <= 10^2
1 <= x <= n
1 <= y <= m

Input Format:
The first line contains an integer, n, denoting the number of rows in the grid.
The next line contains an integer m, denoting the number of columns in the grid.
The next line contains an integer, x, denoting the American cell’s row.
The next line contains an integer, y, denoting the American cell’s column.
Sample Cases
Sample Input 1
2
2
2
1
Sample Output 1
1
Explanation
The only way possible is (1,1) ->(2,1) -> (2,2), so the answer is 1.

 */

package infosyspriprationday3;

import java.util.*;

public class IndianAmericanPath {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt(); //number of rows.
//		int m = sc.nextInt(); //number of column.
//		int x = sc.nextInt(); //American cell’s Row.
//		int y = sc.nextInt(); //American cell’s column.
//		int count = 0;
//		
//		// for access two dimensional array
//		for(int i  =1;i<n;i++) {  // it represent row
//			for(int j =1;j<n;j++) { // it represent column
//				if(i != x && i < n && j < m) {
//					count++;
//				}else {
//					if(j != y) {
//						count++;
//					}
//				}
//			}
//		}
//		System.out.println(count);
//	}

	static int f[] = new int[1000];
	  static int Fact(int n)
	  {
	    if(f[n]==1) return f[n];
	     
	     return f[n]=n*Fact(n-1);
	   }

	  public static void main (String[]args)
	  {
	    Scanner sc = new Scanner (System.in);

	    int n = sc.nextInt ();
	    int m = sc.nextInt ();
	    int x = sc.nextInt ();
	    int y = sc.nextInt ();
	    n-=1;m-=1;x-=1;y-=1;
	    
	    f[0]=f[1]=1;
	    int p=(Fact(m+n)/(Fact(m)*Fact(n)));
	    int imp=((Fact(x+y)/(Fact(x)*Fact(y)))*(Fact(m-x+n-y)/(Fact(m-x)*Fact(n-y))));
	  
	    System.out.println(p-imp);   
	  }
}
