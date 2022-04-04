// Que link: https://leetcode.com/problems/decompress-run-length-encoded-list/
// 1313. Decompress Run-Length Encoded List


class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }
        int[] result = new int[arrSize];

        int startIdx = 0;
        // int k=0;
        for (int i = 0; i < nums.length; i += 2) {
        //  Arrays.fill(int[] a, int fromIndex, int toIndex, int val);
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            // for (int j = 0; j < nums[i]; j++) result[k++] = nums[i+1]; //* alternative of above line.
            startIdx += nums[i];
        }
        return result;
    }
}