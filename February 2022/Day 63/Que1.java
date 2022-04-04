// Que link: https://leetcode.com/problems/majority-element/
// 169. Majority Element


// Method 1:
// Sorting
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}


// Method 2: best
class Solution {
    public int majorityElement(int[] nums) {
        int count=0, ans = 0;
        for (int num: nums) {
            if (count==0){
                ans = num;
                count++;
            }
            else if (num!=ans)
                count--;
            else
                count++;
        }
        return ans;
    }
}



// Method 3:
// Hashtable 
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        //Hashtable<Integer, Integer> myMap = new Hashtable<Integer, Integer>();
        int ans=0;
        for (int num: nums) {
            // if (!myMap.containsKey(num))
            //     myMap.put(num, 1);
            // else
            //     myMap.put(num, myMap.get(num)+1); //* Does the same thing as below line
            myMap.put(num, myMap.getOrDefault(num, 0)+1);

            if (myMap.get(num)>nums.length/2) {
                ans = num;
                break;
            }
        }
        return ans;
    }
}