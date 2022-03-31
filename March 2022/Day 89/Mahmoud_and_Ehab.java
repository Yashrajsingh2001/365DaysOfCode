// Que link: https://codeforces.com/problemset/problem/959/A
// A. Mahmoud and Ehab and the even-odd game


import java.util.*;

public class Mahmoud_and_Ehab{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num%2==0 ? "Mahmoud" : "Ehab");
    }
}