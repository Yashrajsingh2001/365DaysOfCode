// Que link: https://leetcode.com/problems/all-possible-full-binary-trees/
// 894. All Possible Full Binary Trees



/*
We can also add a cache so we don't repeat N values, and return an empty set 
if N is even because we can't make a full binary tree with an even number of nodes. 
(Don't have to create a copy, we can use the same list).
*/

class Solution {
    // Map<Integer,List<TreeNode>> cache= new HashMap<>();
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> res = new ArrayList<>();
        if(N%2==0){
            return res;
        }
        // if(cache.containsKey(N)){
        //     return cache.get(N);
        // }
        if(N==1){
            res.add(new TreeNode(0));
            return res;
        }
        
        N=N-1;
        for(int i=1; i<N;i+=2){
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(N-i);
            for(TreeNode nl: left){
                for(TreeNode nr:right){
                    TreeNode cur = new TreeNode(0);
                    cur.left=nl;
                    cur.right=nr;
                    res.add(cur);
                }
            }
        }
        // cache.put(N+1,res);
        return res;
    }
}

// uncomment to use it. It will make our program faster