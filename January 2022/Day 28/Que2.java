// https://www.codechef.com/problems/CARRANGE
// Problem Code: CARRANGE


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
            int P = scan.nextInt();
            int M = scan.nextInt();
            int V = scan.nextInt();
            System.out.println(V*(M-P+1));
        }
		
	}
}
