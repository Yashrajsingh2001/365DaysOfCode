// Que link: https://leetcode.com/problems/count-good-triplets/
// 1534. Count Good Triplets


class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(Math.abs(arr[i] - arr[j])<=a && Math.abs(arr[j] - arr[k])<=b && Math.abs(arr[i] - arr[k])<=c) ans++;
                }
            }
        }
        return ans;
    }
}



// Little optimization:
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int n = arr.length;
        for(int i = 0; i < n -2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                if(Math.abs(arr[i] - arr[j]) <= a) { // check if satisfy then loop for k
                    for(int k = j + 1; k < n; k++) {
                        if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[k] - arr[i]) <= c)
                            count++;
                    }
                }
            }
        }
        return count;
    }
}