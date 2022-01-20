// https://www.codechef.com/problems/CALPOWER
// Problem Code: CALPOWER



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
            String name = scan.next();
            char[] tempArr = name.toCharArray();
            Arrays.sort(tempArr);
            int len = tempArr.length, ans=0;
            for(int i=0; i<len; i++){
                ans += (i+1)*(tempArr[i] - 96);
            }
            System.out.println(ans);
        }
	}
}
