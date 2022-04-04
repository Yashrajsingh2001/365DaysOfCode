// Que link: https://leetcode.com/problems/permutation-in-string/
// 567. Permutation in String


// Method 1:
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length(),n2=s2.length();
        int[] f1=new int[26];
        for(int i=0;i<n1;i++) f1[s1.charAt(i)-'a']++;

        int[] f2=new int[26];
        for(int j=0;j<n2;j++){
            f2[s2.charAt(j)-'a']++;
            if(j>=n1) f2[s2.charAt(j-n1)-'a']--;
            if(Arrays.equals(f2,f1)) return true;
        }
        return false;
    }
}



// Method 2:
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;
        
        int[] count = new int[26];
        for (int i = 0; i < len1; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (allZero(count)) return true;
        
        for (int i = len1; i < len2; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - len1) - 'a']++;
            if (allZero(count)) return true;
        }       
        return false;
    }
    
    private boolean allZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }
}