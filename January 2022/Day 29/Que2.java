// Que link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
// 2011. Final Value of Variable After Performing Operations

// Method 1:
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String i : operations){
            if(i.equals("++X") || i.equals("X++")) X++; // might give wrong ans with i=="++X", so use '.equals'
            else X--;
        }
        return X;
    }
}



// Method 2:
class Solution {
    public int finalValueAfterOperations(String[] operations) {
    	int X = 0;
    	for(int i=0;i<operations.length;i++) {
    		if(operations[i].charAt(1)=='+') X++;
    		else X--;
    	}
    	return X;        
    }
}