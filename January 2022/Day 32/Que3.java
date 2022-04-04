// https://www.codechef.com/problems/PENALTY
// Problem Code: PENALTY



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
        while(T-- >0){
            int a=5, t1=0, t2=0;
            while(a-- >0){
                t1 += scan.nextInt();
                t2 += scan.nextInt();    
            }
            System.out.println(t1>t2 ? 1 : t2>t1 ? 2 : 0);
        }
	}
}
