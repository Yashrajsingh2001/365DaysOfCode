// Que LINK: https://leetcode.com/problems/number-of-good-pairs/

// Method 1
class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int ans = 0;
        int[] count = new int[101];
        
        for(int n: nums)
            count[n]++;
        
        for(int n: count)
            ans += (n * (n - 1))/2;
        
        return ans;
    }
}

// Method 2
class Solution {
    public int numIdenticalPairs(int[] nums) {
	    int answer = 0;
	    int[] freq = new int[102];
        
	    for (int i : nums) {
		    if (freq[i] == 0)
                freq[i]++;
		    else{
			    answer += freq[i];
			    freq[i]++;
		    }
	    }
	    return answer;
    }
}