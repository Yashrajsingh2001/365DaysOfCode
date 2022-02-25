// Que link: https://leetcode.com/problems/compare-version-numbers/
// 165. Compare Version Numbers


class Solution {
    public int compareVersion(String version1, String version2) {
        for(int i=0, j=0; i<version1.length() || j<version2.length(); i++, j++){
            int num1=0, num2=0;
            
            while(i<version1.length() && version1.charAt(i) != '.'){
                num1 = num1*10 + (version1.charAt(i) - '0');
                i++;
            }
            
            while(j<version2.length() && version2.charAt(j) != '.'){
                num2 = num2*10 + (version2.charAt(j) - '0');
                j++;
            }
            
            if(num1 > num2) return 1;
            else if(num1 < num2) return -1;
        }
        return 0;
    }
}