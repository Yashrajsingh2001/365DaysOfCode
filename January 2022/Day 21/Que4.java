// Que link: https://leetcode.com/problems/intersection-of-two-arrays/
// 349. Intersection of Two Arrays

import java.util.HashSet;


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> ans = new HashSet<Integer>();

        for (int i : nums1) {
            set.add(i);
        }
        for(int i : nums2){
            if(set.contains(i)){
                ans.add(i);
            }
        }
        int[] result = new int[ans.size()];
        int i = 0;
        for (Integer num : ans) {
            result[i++] = num;
        }
        return result;
    }
}