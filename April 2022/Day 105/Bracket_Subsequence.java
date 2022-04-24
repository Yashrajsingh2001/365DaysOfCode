// Que link: https://codeforces.com/problemset/problem/1023/C
// C. Bracket Subsequence


import java.util.*;

public class Bracket_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int nLen = sc.nextInt();
        String s = sc.next();
        char[] arr = s.toCharArray();

        int l=(len-nLen)/2, r=l;
        for(int i=len-1; l>0 || r>0; i--){
            if(arr[i]==')' && l>0){
                arr[i]='0';
                l--;
            } else if(arr[i]=='(' && r>0){
                arr[i]='0';
                r--;
            }
        }
        for(char c : arr){
            if(c!='0') System.out.print(c);
        }
    }
}