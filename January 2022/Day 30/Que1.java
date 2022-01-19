// Que link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// 1281. Subtract the Product and Sum of Digits of an Integer



class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0, product=1;
        while(n>0){
            sum += n%10;
            product *= n%10;
            n /= 10;
        }
        return product-sum;
    }
}