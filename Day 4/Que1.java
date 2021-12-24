// Que LINK: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0, n=candies.length;
        for(int i=0; i<n; i++){
            max = candies[i]>max?candies[i]:max;
            candies[i]+=extraCandies;
        }
        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            result.add(candies[i] >= max);
        }
        return result;
    }
}