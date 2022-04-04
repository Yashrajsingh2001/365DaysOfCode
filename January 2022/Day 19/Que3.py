# Que link: https://leetcode.com/problems/ransom-note/

class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        ransomNote = [i for i in ransomNote]
        magazine = [i for i in magazine]

        for i in ransomNote:
            if i in magazine:
                magazine.remove(i)
            else:
                return False
        return True