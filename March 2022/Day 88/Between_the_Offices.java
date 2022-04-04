// Que link: https://codeforces.com/problemset/problem/867/A
// A. Between the Offices


import java.util.*;

public class Between_the_Offices{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        int SF=0, FS=0;
        for(int i=0; i<num-1; i++){
            if(str.charAt(i)=='S' && str.charAt(i+1)=='F') SF++;
            if(str.charAt(i)=='F' && str.charAt(i+1)=='S') FS++;
        }
        System.out.println(SF>FS?"YES":"NO");
    }
}
