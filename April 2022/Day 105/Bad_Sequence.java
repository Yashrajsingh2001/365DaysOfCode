// Que link: https://codeforces.com/problemset/problem/1214/C
// C. Bad Sequence


import java.util.*;

public class Bad_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String s = sc.next();

        int k = 0, m = 0;
        for(char c : s.toCharArray()){
            if(c=='(') k++;
            else k--;
            m = Math.min(m,k);
        }

        if (k == 0 && m >= -1) System.out.println("Yes");
        else System.out.println("No");
    }
}