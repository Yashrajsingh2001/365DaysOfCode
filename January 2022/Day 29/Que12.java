// https://www.codechef.com/problems/FCTRL
// Problem Code: FCTRL



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
            int base=5, ans=0, resBase=5;
            while(resBase<=n){
                ans += n/resBase;
                resBase *= base;
            }
            System.out.println(ans);
        }
	}
}
