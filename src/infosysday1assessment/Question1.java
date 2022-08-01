package infosysday1assessment;

/*
 * Problem statement:
In an airport , the Airport authority decides to charge some minimum amount to the passengers who are carrying
luggage with them. They set a threshold weight value, say T, if the luggage exceeds the weight threshold 
you should pay double the base amount. If it is less than or equal to threshold then you have to pay $1.
Function Description:

Complete the weightMachine function in the editor below. It has the following parameter(s):

Parameters:

Name Type Description

N Integer number of luggage

T Integer weight of each luggage

weights[ ] Integer array threshold weight

Returns: The function must return an INTEGER denoting the required amount to be paid.

Constraints:

1 <= N <= 10^5

1 <= weights[i] <= 10^5

1 <= T <= 10^5

Input Format for Custom Testing:

The first line contains an integer, N, denoting the number of luggages.

Each line i of the N subsequent lines (where 0 <= i <n) contains an integer describing weight of ith luggage.

The next line contains an integer, T, denoting the threshold weight of the boundary wall.

Sample Cases:

Sample Input
4
1
2
3
4
3

Sample Output
5
*/

import java.util.*;

class Question1 {
		
		  static int weightMachine (int N, int weights[],int T)
		  {
		    int amount = 0, i;
		    for (i = 0; i < N; i++)
		    {
			   amount++;
			   if (weights[i] > T)
			   {
			      amount++;
			    }
		    }
		    return amount;
		  }

		  public static void main (String[]args)
		  {
		    Scanner sc = new Scanner (System.in);

		    int n = sc.nextInt ();
		    int weights[]= new int[n];
		    
		    for(int i=0; i<n; i++)
		      weights[i] = sc.nextInt();
		    
		    int t = sc.nextInt ();
		      
		    System.out.println (weightMachine(n, weights, t));
		  
		      
		  }
	}

