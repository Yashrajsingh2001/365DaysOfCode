// Que link: https://leetcode.com/problems/check-if-n-and-its-double-exist/
// 1346. Check If N and Its Double Exist


// Method 1:
class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]*2 && i != j) return true;
            }
        }
        return false;
    }
}


// Method 2:
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr) {
            if(set.contains(a*2) || (a%2 == 0 && set.contains(a/2))) 
                return true;
            set.add(a);
        }
        return false;
    }
}