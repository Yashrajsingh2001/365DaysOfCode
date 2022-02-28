// Que link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/
// 1380. Lucky Numbers in a Matrix


class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int small, big;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < matrix.length; i++){
            int k = 0;
            small = Integer.MAX_VALUE;             
            for(int j = 0; j < matrix[0].length; j++){                
                if(small > matrix[i][j]){
                    small = matrix[i][j];
                    k = j;
                }
            }
            big = small;
            for(int j = 0; j < matrix.length; j++){
                big = Math.max(big, matrix[j][k]);
            }
            if(small == big) {
                list.add(small);
            }
        }
        return list;
    }
}