// Que link: https://codeforces.com/problemset/problem/1041/B
// B. Buying a TV Set

//* Solve again
import java.util.*;

public class Buying_a_TV_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        long gcd = 0, n1, n2;
        n1 = (x > y) ? x : y; // a is greater number
        n2 = (x < y) ? x : y; // b is smaller number
        gcd = n2;
        while (n1 % n2 != 0) {
            gcd = n1 % n2;
            n1 = n2;
            n2 = gcd;
        }

        x = x / gcd;
        y = y / gcd;

        System.out.println(Math.min(a / x, b / y));
        
        /*
        //*! TLE
        long n1 = x, n2 = y;
        while (x != y) {
            if (x > y) x=x-y;
            else y=y-x;
        } //GCD is y now
        
        x = n1 / y;
        y = n2 / y;
        System.out.println(Math.min(a / x, b / y));
        */
    }
}