// Que link: https://codeforces.com/problemset/problem/805/B
// B. 3-palindrome


import java.util.*;

public class three_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
        * This method is giving TLE:
        String a = "aabb", ans = "";
        //* while(ans.length()<n) ans += a;
        int cnt = n / 4 + 1;
        while (cnt-- > 0)
            ans += a;

        System.out.println(ans.substring(0, n));
        */


        char[] ans = new char[n];
        for (int i = 0; i < n; i++) {
            ans[i] = 'a';
        }
        for (int i = 2; i < n; i += 4) {
            ans[i] = 'b';
            if (i + 1 < n) {
                ans[i + 1] = 'b';
            }
        }
        System.out.println(String.valueOf(ans));
    }
}