// Que link: https://codeforces.com/problemset/problem/1244/A
// A. Pens and Pencils


import java.util.*;

public class Pens_and_Pencils{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- >0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    int k = sc.nextInt();
		    
            int ac = (int) Math.ceil((double)a/c);
            int bd = (int) Math.ceil((double)b/d);
            if(ac+bd<=k) System.out.println(ac + " " + bd);
            else System.out.println(-1);
        }
	}
}