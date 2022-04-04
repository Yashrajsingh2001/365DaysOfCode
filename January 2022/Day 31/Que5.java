// https://www.codechef.com/problems/VISA
// Problem Code: VISA




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
            int x1 = scan.nextInt();
            int x2 = scan.nextInt();
            int y1 = scan.nextInt();
            int y2 = scan.nextInt();
            int z1 = scan.nextInt();
            int z2 = scan.nextInt();
            System.out.println(x2>=x1 && y2>=y1 && z2<=z1 ? "YES" : "NO");
        }
	}
}
