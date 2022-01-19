// https://www.codechef.com/problems/GOODWEAT
// Problem Code: GOODWEAT




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
            int sum=0;
            for(int i=0; i<7; i++){
                sum += scan.nextInt(); 
            }
            System.out.println(sum*2>7 ? "YES" : "NO");
        }
	}
}
