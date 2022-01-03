# Que LINK: https://leetcode.com/problems/contains-duplicate/

# Method 1:
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        return len(nums) > len(set(nums))

# Method 2:
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        record = set()
        for num in nums:
            if num in record:
                return True
            else:
                record.add(num)
        else:
            return False