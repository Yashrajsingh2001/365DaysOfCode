// https://www.codechef.com/problems/TYRES
// Problem Code: TYRES


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T-- != 0){
            int N = scan.nextInt();
            String ans="";
            ans = (N%4 != 0) ? "YES" : "NO";
            System.out.println(ans);
        }
	}
}
