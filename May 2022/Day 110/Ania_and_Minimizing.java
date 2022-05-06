// Que link: https://codeforces.com/problemset/problem/1230/B
// B. Ania and Minimizing

import java.util.*;

public class Ania_and_Minimizing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
        char[] S = sc.next().toCharArray();
        if(n==1){
            if(k==0) System.out.println(S[0]);
            else System.out.println("0");
            return;
        }
        if(S[0]!='1' && k>0){
            S[0]='1';
            k--;
        }

        int  i=1;
        while(k>0 && i<n){
            if(S[i]!='0'){
                S[i]='0';
                k--;
            }
            i++;
        }
        for(char a : S) System.out.print(a);
    }
}