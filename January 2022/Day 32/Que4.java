// https://www.codechef.com/problems/LAPIN
// Problem Code: LAPIN



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
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0)
        {
            String S = sc.next();
            int len = S.length();
            String half1="",half2="";
            int c=0;
            half1=S.substring(0,len/2);
            if(len%2==0) half2=S.substring(len/2);
            else if(len%2!=0) half2=S.substring(len/2+1);
            char h1[] = half1.toCharArray();
            char h2[] = half2.toCharArray();
            Arrays.sort(h1);
            Arrays.sort(h2);
            half1 = String.copyValueOf(h1);
            half2 = String.copyValueOf(h2);
    
            if(half1.equals(half2)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}