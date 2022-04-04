// Que link: https://leetcode.com/problems/defanging-an-ip-address/
// 1108. Defanging an IP Address


class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}


// Slow:
class Solution {
    public String defangIPaddr(String address) {
        String ans="";
        for(char i : address.toCharArray()){
            if(i=='.') ans += "[.]";
            else ans += i;
        }
        return ans;
    }
}