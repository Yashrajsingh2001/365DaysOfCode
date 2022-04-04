// Que link: https://codeforces.com/problemset/problem/1080/A
// A. Petya and Origami


import java.util.*;

public class Petya_and_Origami{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int friends = sc.nextInt();
		int sheets = sc.nextInt();
        int r=2, g=5, b=8;
        
        int ans = (int)Math.ceil((double)friends*r/sheets) + (int)Math.ceil((double)friends*g/sheets) + (int)Math.ceil((double)friends*b/sheets);
        System.out.println(ans);

        // * Cleaner version of above 3 lines.
        // int ans=0;
        // int[] rgb = {2,5,8};
        // for (int i : rgb) {
        //     ans += (int)Math.ceil((double)friends*i/sheets);
        // } 
        // System.out.println(ans);
	}
}