// https://www.codechef.com/problems/RECTANGL
// Problem Code: RECTANGL



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
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();
            int D = scan.nextInt();
            System.out.println((A+B==C+D || A+C==B+D || A+D==B+C) ? "YES" : "NO");
        }
	}
}
