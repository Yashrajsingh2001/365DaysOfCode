// https://www.codechef.com/problems/CHEFTRANS
// Problem Code: CHEFTRANS



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
            int X = scan.nextInt();
            int Y = scan.nextInt();
            int Z = scan.nextInt();
            System.out.println(X+Y<Z ? "PLANEBUS" : X+Y>Z ? "TRAIN" : "EQUAL");
        }
	}
}
