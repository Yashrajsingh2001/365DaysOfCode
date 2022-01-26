// Que link: https://leetcode.com/problems/truncate-sentence/
// 1816. Truncate Sentence


class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        s="";
        for(int i=0; i<k; i++){
            s += arr[i] + " ";
        }
        s=s.trim(); // For removing the last space
        return s;
    }
}


// Without .trim()
class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        s=arr[0];
        for(int i=1; i<k; i++){
            s += " " + arr[i];
        }
        return s;
    }
}



// Fast
class Solution {
    public String truncateSentence(String s, int k) {
       int idx=0;
       int spaceCount=0;
       
       while(idx<s.length() && spaceCount<k){
           if(s.charAt(idx)==' ') spaceCount++;
           idx++;
       }
       // if(spaceCount<k) means we have to include whole string 
       return spaceCount==k?s.substring(0,idx-1):s;
   }
}