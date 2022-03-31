// Que link: https://codeforces.com/problemset/problem/935/A
// A. Fafa and his Company


import java.util.*;

public class Fafa_and_his_Company{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans=0;
        for(int i=1; i<=num/2; i++)
            if(num%i==0) ans++;
        System.out.println(ans);
    }
}