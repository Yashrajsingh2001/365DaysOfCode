# Que link: https://leetcode.com/problems/intersection-of-two-arrays/
# 349. Intersection of Two Arrays

class Solution(object):
    def intersection(self, nums1, nums2):
        return list(set(nums1).intersection(set(nums2)))