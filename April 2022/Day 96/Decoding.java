// Que link: https://codeforces.com/problemset/problem/746/B
// B. Decoding


import java.util.*;

public class Decoding{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String st = sc.next();
        int c=0;
        String ans="";
        for(int i=0; i<len; i++){
            if((len-c)%2==1) ans=ans+st.charAt(i);
            else ans=st.charAt(i)+ans;
            c++;
        }
        System.out.println(ans);
	}
}