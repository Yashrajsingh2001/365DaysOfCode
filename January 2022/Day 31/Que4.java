// https://www.codechef.com/problems/PRICECON
// Problem Code: PRICECON



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
            int n = scan.nextInt();
            int k = scan.nextInt();
            int before=0, after=0, a=0;
            for(int i=0; i<n; i++){
                a = scan.nextInt();
                before += a;
                after += a > k ? k : a;
            }
            System.out.println(before-after);
        }
	}
}
