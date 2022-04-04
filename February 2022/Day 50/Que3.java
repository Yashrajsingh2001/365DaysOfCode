// Que link: https://leetcode.com/problems/jewels-and-stones/
// 771. Jewels and Stones


// Method 1:
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        for(char i : jewels.toCharArray()){
            for(char j : stones.toCharArray()){
                if(i==j) ans++;
            }
        }
        return ans;
    }
}


// Method 2:
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        Set setJ = new HashSet();
        for (char j: jewels.toCharArray())
            setJ.add(j);
        for (char s: stones.toCharArray())
            if (setJ.contains(s)) ans++;
        return ans;
    }
}