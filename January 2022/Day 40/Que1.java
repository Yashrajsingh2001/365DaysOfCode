// Que link: https://leetcode.com/problems/largest-rectangle-in-histogram/
// 84. Largest Rectangle in Histogram



import java.util.Stack;

class Que1 {
	static public int largestRectangleArea(int[] heights) {
		int n = heights.length;
		Stack<Integer> stack = new Stack();
		int maxArea = 0;
		for (int i = 0; i <= n; i++) {
			int h = i == n ? 0 : heights[i];
			while (!stack.isEmpty() && h < heights[stack.peek()]) {
				int curHeight = heights[stack.pop()];
				int prevIndex = stack.isEmpty() ? -1 : stack.peek();
				int area = curHeight * (i - prevIndex - 1);
				maxArea = Math.max(maxArea, area);
			}
			stack.push(i);
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int[] height = { 2, 1, 5, 6, 2, 3 };
		System.out.println(largestRectangleArea(height));
	}
}


/*
//* For LeetCode submission
class Solution {
    public int largestRectangleArea(int[] heights) {
      int n = heights.length;
      Stack<Integer> stack = new Stack();
      int maxArea = 0;
      for(int i = 0; i <= n; i++){
        int h = i == n ? 0 : heights[i];
        while(!stack.isEmpty() && h < heights[stack.peek()]){
          int curHeight = heights[stack.pop()];
          int prevIndex = stack.isEmpty() ? -1 : stack.peek();
          int area = curHeight * (i - prevIndex - 1);
          maxArea = Math.max(maxArea, area);
        }
        stack.push(i);
      }
      return maxArea;  
    }
}
*/




// Fast:
class Solution {
    public static int largestRectangleArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int[] lessFromLeft = new int[height.length]; // idx of the first bar the left that is lower than current
        int[] lessFromRight = new int[height.length]; // idx of the first bar the right that is lower than current
        lessFromRight[height.length - 1] = height.length;
        lessFromLeft[0] = -1;

        for (int i = 1; i < height.length; i++) {
            int p = i - 1;

            while (p >= 0 && height[p] >= height[i]) {
                p = lessFromLeft[p];
            }
            lessFromLeft[i] = p;
        }

        for (int i = height.length - 2; i >= 0; i--) {
            int p = i + 1;

            while (p < height.length && height[p] >= height[i]) {
                p = lessFromRight[p];
            }
            lessFromRight[i] = p;
        }

        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
        }

        return maxArea;
    }
}