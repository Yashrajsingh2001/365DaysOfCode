// https://www.codechef.com/problems/HOOPS
// Problem Code: HOOPS



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
            if (n==1) System.out.println(1);
            else if (n==2) System.out.println(2); 
            else System.out.println(n%2==1 ? n/2+1 : n/2);
        }
	}
}
