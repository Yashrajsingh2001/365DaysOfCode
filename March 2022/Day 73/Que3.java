// Pangram Check

// All alphabet should be present
public class Solution {
    public int solve(ArrayList<String> A) {
        boolean vis[] = new boolean[26];
        for(String str: A){
            for(int i = 0; i < str.length(); ++i){
                vis[str.charAt(i)-'a'] = true;
            }
        }
        for(int i = 0; i < 26; ++i){
            if(!vis[i]){
                return 0;
            }
        }
        return 1;
    }
}


// We can put multiple if condition to check for capital and small alphabet

/*
if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
    vis[index = str.charAt(i) - 'A'] = true;
else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
    vis[index = str.charAt(i) - 'a'] = true;
else continue;
*/