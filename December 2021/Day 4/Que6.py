# Que link: https://leetcode.com/problems/count-items-matching-a-rule/

class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        cnt=0
        for i in items:
            if ruleKey=='type' and ruleValue==i[0]:
                cnt+=1
            elif ruleKey=='color' and ruleValue==i[1]:
                cnt+=1
            elif ruleKey=='name' and ruleValue==i[2]:
                cnt+=1
        return cnt