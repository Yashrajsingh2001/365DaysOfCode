# Que LINK: https://leetcode.com/problems/check-if-the-sentence-is-pangram/

# Method 1:
class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        abc = 'abcdefghijklmnopqrstuvwxyz'
        for i in sentence:
            abc = abc.replace(i,'') 
        return (abc=='')

# Method 2:
class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        return len(set(sentence)) == 26