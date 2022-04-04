// Que link: https://codeforces.com/problemset/problem/831/B
// B. Keyboard Layouts


import java.util.*;

public class Keyboard_Layouts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		char[] st1 = sc.next().toCharArray();
		char[] st2 = sc.next().toCharArray();
		char[] txt = sc.next().toCharArray();

        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0; i<26; i++){
            map.put(st1[i], st2[i]);
        }

        String ans="";
        for(Character ch : txt){
            if(ch>='a' && ch<='z'){
                ans += map.get(ch);
            }
            else if(ch>='A' && ch<='Z'){
                ans += Character.toUpperCase(map.get(Character.toLowerCase(ch)));
            }
            else ans += ch;
        }
        System.out.println(ans);
    }
}
