// https://www.codechef.com/problems/UTKPLC
// Problem Code: UTKPLC



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
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            map.put(scan.next().charAt(0), 1);
            map.put(scan.next().charAt(0), 2);
            map.put(scan.next().charAt(0), 3);
            
            char x = scan.next().charAt(0);
            char y = scan.next().charAt(0);
            
            if(map.get(x)< map.get(y)) System.out.println(x);
            else System.out.println(y);
        }
	}
}
