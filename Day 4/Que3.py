class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        nums1 = sorted(nums)
        l=[]
        for num in nums:
            l.append(nums1.index(num))
        return l