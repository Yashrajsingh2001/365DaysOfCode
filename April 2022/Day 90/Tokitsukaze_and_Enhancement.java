// Que link: https://codeforces.com/problemset/problem/1191/A
// A. Tokitsukaze and Enhancement


import java.util.*;

public class Tokitsukaze_and_Enhancement{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String st = "";
        if(n%4==1) st = "0 A";
        else if(n%4==3) st = "2 A";
        else if(n%4==2) st = "1 B";
        else st = "1 A";
        System.out.println(st);
	}
}