// Que link: https://codeforces.com/problemset/problem/1220/A
// A. Cards


import java.util.*;

public class Cards{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        int n=0, z=0;
        for(char i : str.toCharArray()){
            if(i=='n') n++; 
            else if(i=='z') z++; 
        }
        String ans = "";
        while(n-- >0) ans += 1+" ";
        while(z-- >0) ans += 0+" ";
        System.out.println(ans.strip());
    }
}




/*
import java.util.*;

public class Cards{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();

        int o=0, n=0, e=0, z=0, r=0, one=0, zero=0;
        for(char i : str.toCharArray()){
            if(i=='o') o++;
            else if(i=='n') n++; 
            else if(i=='e') e++; 
            else if(i=='z') z++; 
            else if(i=='r') r++; 

            if(o>0 && n>0 && e>0){
                o--; n--; e--;
                one++;
            }
            if(z>0 && e>0 && r>0 && o>0){
                z--; e--; r--; o--;
                zero++;
            }
        }
        // System.out.println(one + " " + zero);
        String ans = "";
        while(one-- >0) ans += 1+" ";
        while(zero-- >0) ans += 0+" ";
        System.out.println(ans.strip());
    }
}
*/