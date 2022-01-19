// Que link: https://leetcode.com/problems/roman-to-integer/
// 13. Roman to Integer


// Method 1:
class Solution {
    public int romanToInt(String s) {
        int[] map = new int[256];
        map['I'] = 1; map['V'] = 5; map['X'] = 10; map['L'] = 50; map['C'] = 100; map['D'] = 500; map['M'] = 1000;
        
        int ret = 0, pre = 1;
        for (int i = s.length()-1; i >= 0; --i) {
            int cur = map[s.charAt(i)];
            if (cur < pre) ret -= cur;
            else {
                pre = cur;
                ret += cur;
            }
        }
        return ret;
    }
}



// Method 2:
class Solution {
    public int romanToInt(String s) {
        int sum=0;
        if(s.indexOf("IV")!=-1) sum-=2;
        if(s.indexOf("IX")!=-1) sum-=2;
        if(s.indexOf("XL")!=-1) sum-=20;
        if(s.indexOf("XC")!=-1) sum-=20;
        if(s.indexOf("CD")!=-1) sum-=200;
        if(s.indexOf("CM")!=-1) sum-=200;

        char c[]=s.toCharArray();
        for(int count=0;count<=s.length()-1;count++){
            if(c[count]=='M') sum+=1000;
            else if(c[count]=='D') sum+=500;
            else if(c[count]=='C') sum+=100;
            else if(c[count]=='L') sum+=50;
            else if(c[count]=='X') sum+=10;
            else if(c[count]=='V') sum+=5;
            else if(c[count]=='I') sum+=1;
        }
        return sum;
    }
}