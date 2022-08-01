package infosysday1assessment;

/*
 * Shovon is an HR in a renowned company and he is assigning people to work. Now he is assigning people 
 * work in a fashion where if he assigns somework a work of cost 2, the next person will be strictly getting 
 * a job with cost equal or more than 2. Given that Shovon’s company has infinite work and a number of employees,
 * how many distributions can be possible. The cost of jobs can go 0 to 9.

	Function Description:
	Complete the special_numbers function in the editor below. It has the following parameter(s):

	Parameters:
		Name	Type	Description
		N	Integer	The number of depts.
		arr[ ]	Integer array	The number of  employees in each dept..
	
	Return:
		The function must return an INTEGER denoting the sum of answers for all distinct distributions.

Constraints:
	1 <= n <= 100
	1 <= arr[i] <= 200

Sample Cases:
	Sample Input 1
		2
		4
		1
	Sample Output 1
	725
 */

import java.util.*;

public class Question2 {

	static int func(int s,int p,int n)
	  {
	    if(p==n-1) return 1;
	    
	    int ans=0;
	    
	    for(int i=s;i<=9;i++)
	    ans += func(i,p+1,n);
	 
	    return ans;
	  }

	  public static void main (String[]args)
	  {
	    Scanner sc = new Scanner (System.in);

	    int n = sc.nextInt ();
	    int  ans=0;
	    
	    for(int i=0; i<n; i++){
	        
	        int a = sc.nextInt ();
	        for(int j=0; j<=9; j++)
	           ans+=func(j,0,a);
	        
	    }
	    
	    System.out.println (ans);
	     
	  }

	}
