// Que LINK: https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < sentence.length(); ++i)
            s.add(sentence.charAt(i));
        return s.size() == 26;
    }
}