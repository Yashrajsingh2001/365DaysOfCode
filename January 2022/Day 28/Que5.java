// https://www.codechef.com/problems/COCONUT
// Problem Code: COCONUT



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
            int xa = scan.nextInt();
            int xb = scan.nextInt();
            int Xa = scan.nextInt();
            int Xb = scan.nextInt();
            System.out.println(Xa/xa + Xb/xb);
        }
		
	}
}