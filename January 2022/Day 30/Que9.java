// https://www.codechef.com/problems/MAKEEQUAL
// Problem Code: MAKEEQUAL



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
            int[] a = new int[n];
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                a[i] = scan.nextInt();
                if(a[i]<min) min=a[i];
                if(a[i]>max) max=a[i]; 
            }
            System.out.println(max-min);
        }
	}
}