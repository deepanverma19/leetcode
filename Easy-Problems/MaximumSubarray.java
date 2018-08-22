/*

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle

*/

public class MaximumSubarray{
  public static void main(String[] args) {
    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubarray(nums));
  }
  private static int maxSubarray(int[] nums){
    int x = nums[0], y = nums[0];
    for(int i=1;i<nums.length;i++){
      y = Math.max(nums[i], y+nums[i]);
      x = Math.max(x,y);
    }
    return x;
  }
}
