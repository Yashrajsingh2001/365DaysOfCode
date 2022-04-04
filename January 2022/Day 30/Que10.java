// https://www.codechef.com/problems/KEPLERSLAW
// Problem Code: KEPLERSLAW



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
            int T1 = scan.nextInt();
            int T2 = scan.nextInt();
            int R1 = scan.nextInt();
            int R2 = scan.nextInt();
            if(Math.pow(T1,2)/Math.pow(R1,3) == Math.pow(T2,2)/Math.pow(R2,3))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
	}
}
