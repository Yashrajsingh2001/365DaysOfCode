// https://www.codechef.com/problems/TRISQ
// Problem Code: TRISQ



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
            int base= scan.nextInt();
        //   base -= 2;
        //   base = (int)(base/2);
        //   System.out.println(base*(base+1)/2);
           base = (base-2)/2;
           System.out.println(base*(base+1)/2);
        }
	}
}
