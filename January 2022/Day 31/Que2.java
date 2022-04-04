// https://www.codechef.com/problems/FILL01
// Problem Code: FILL01



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
            int N = scan.nextInt();
            int K = scan.nextInt();
            String S = scan.next();
            int Temp=0, naps=0;
            for(int i=0 ; i<N ; i++){
                if(S.charAt(i) == '1') Temp=0;
                else if(S.charAt(i) == '0') Temp++;
                if(Temp == K){
                    Temp=0;
                    naps++;
                }
            }
            System.out.println(naps);
	    }
    }
}