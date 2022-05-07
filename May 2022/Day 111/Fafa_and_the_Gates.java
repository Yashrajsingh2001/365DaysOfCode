// Que link: https://codeforces.com/problemset/problem/935/B
// B. Fafa and the Gates


import java.util.*;

public class Fafa_and_the_Gates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        char[] S = sc.next().toCharArray();
        int coin=0, u=0, r=0;

        for(int i=0; i<n-1; i++){
            if(S[i]=='U') u++;
            else r++;

            if(u==r && S[i]==S[i+1]) coin++;
        }
        System.out.println(coin);
    }
}