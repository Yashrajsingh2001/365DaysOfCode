import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Que link: https://leetcode.com/problems/word-pattern/
// 290. Word Pattern

public class Que9 {
    static public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        /*for (Integer i=0; i<words.length; i++)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;*/
        for (int i=0; i<words.length; i++)
            if (!Objects.equals(index.put(pattern.charAt(i), i), index.put(words[i], i))) //.put(key, value)
                return false;
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}