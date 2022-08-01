package examples;

import java.util.*;
import java.io.*;
import java.lang.Math;
import java.util.ArrayList;

//public class Main
//{
//  public static String taskComplete(int N, String[] name,int[] work)
//  {
//
//    //this is default OUTPUT. You can change it.
//    List<String> list = new ArrayList<>();
//    String s1 = null,s2 = null;
//    int j = (N-1);
//    for(int i = (N-1); i >= 0; i--){
//      while(j >= 0){
//    	  
//          if(work[i] == 1){
//            s1 = name[i];
//            if(work[j] == 0){
//            s2 = name[j];
//            s1=s1+" "+s2;
//            System.out.println(s1);
//            j--;
//            break;
//            }
//            j--;
//          }else {
//        	  break;
//          }
//      }
//    }
//
//
//      return s1;
//  }
//  public static void main (String[]args)
//  {
//    Scanner sc = new Scanner (System.in);
//
//    //INPUT [uncomment & modify if required]
//    int N = sc.nextInt(); 
//    
//    String name[] = new String[N];
//    int work[] = new int[N];
//    for(int i=0;i<N;i++)
//    {
//    	System.out.println("name :");
//        name[i] = sc.next();
//        System.out.println("no :");
//        work[i] = sc.nextInt();
//    }
//
//    sc.close ();
//
//    //OUTPUT [uncomment & modify if required]
//    taskComplete(N,name,work);
//  }
//}

//public class Main
//{
//  public static void secretWord(int N, String s)
//  {
//
//    //this is default OUTPUT. You can change it.
//    String result = null;
//    int l = 0;
//    char a = 0;
//    List<Character> list = new ArrayList<>();
//       for(int i = 0; i<N ; i++ ){
//            a = s.charAt(i);
//           l = a;
//           l=a-97;
//           l=122-l;
//           a=(char)l;
//           list.add(a);
//       }
//       for(char c: list) {
//       System.out.print(c);
//       }
//
//  }
//  public static void main (String[]args)
//  {
//    Scanner sc = new Scanner (System.in);
//
//    //INPUT [uncomment & modify if required]
//    int N = sc.nextInt ();
//    String S = sc.next();
//    
//    sc.close ();
//
//    //OUTPUT [uncomment & modify if required]
//    secretWord(N,S);
//  }
//}

public class Main {
	public static int getFinalArray(int n, int m, int[] a, String s) {

		// this is default OUTPUT. You can change it.
		int result = -404;
		for (int i = 0; i < s.length(); i++) {
			int mid = n / 2;
			if (s.charAt(i) == 'L') {
				int l = mid - 1;
				int last = (mid / 2);
				for (int j = 0; j < last; j++) {
					a[j] = a[l] + a[j] - (a[l] = a[j]);
					l--;
				}
			}
			if (s.charAt(i) == 'R') {
				int last = mid + (mid / 2);
				int l = (n - 1);
				for (int j = mid; j <= last; j++) {
					a[j] = a[j] + a[l] - (a[l] = a[j]);
					l--;
				}
			}
			if (s.charAt(i) == 'A') {
				int l = n - 1;
				for (int j = 0; j < mid; j++) {
					a[j] = a[j] + a[l] - (a[l] = a[j]);
					l--;
				}
			}
			if (s.charAt(i) == 'S') {
				int l = (n - 1);
				int last = mid;
				for (int j = 0; j < last; j++) {
					a[j] = a[mid] + a[j] - (a[mid] = a[j]);
					mid++;
				}
			}
		}
		for (int k = 0; k < n; k++) {
			System.out.print(a[k]);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// INPUT [uncomment & modify if required]
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		String S = sc.next();

		sc.close();

		// OUTPUT [uncomment & modify if required]
		getFinalArray(N, M, A, S);
	}
}