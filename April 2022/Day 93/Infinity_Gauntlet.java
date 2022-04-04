// Que link: https://codeforces.com/problemset/problem/987/A
// A. Infinity Gauntlet


import java.util.*;

public class Infinity_Gauntlet{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("purple", "Power");
        map.put("green", "Time");
        map.put("blue", "Space");
        map.put("orange", "Soul");
        map.put("red", "Reality");
        map.put("yellow", "Mind");
        
        for(int i=0; i<t; i++){
            String a = sc.next();
            map.remove(a);
        }
        
        System.out.println(6-t);
        for(String key : map.keySet())
            System.out.println(map.get(key));
	}
}