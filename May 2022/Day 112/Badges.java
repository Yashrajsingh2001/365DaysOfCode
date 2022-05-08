// Que link: https://codeforces.com/problemset/problem/1214/B
// B. Badges

import java.util.*;

public class Badges{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int b=sc.nextInt(), g=sc.nextInt(), n=sc.nextInt();
	    b = Math.min(b, n);
	    g = Math.min(g, n);

		// System.out.println(b-(n-g)+1);
		System.out.println(b+g-n+1);
	}
}