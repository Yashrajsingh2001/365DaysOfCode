// Que Link: https://leetcode.com/problems/maximum-product-subarray/
class Que3 {
    public int maxProduct(int[] nums) {
        int l=1, r=1, n=nums.length, ans=nums[0];
        
        for(int i=0;i<n;i++){    
            l = l==0 ? 1 : l;
            r = r==0 ? 1 : r;
            
            l *= nums[i];
            r *= nums[n-1-i];
            
            ans = Math.max(ans,Math.max(l,r));
        }
        return ans;
    }
}