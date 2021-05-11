/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

*/

class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] diff = new int[nums.length];
        diff[0] = target - nums[0];
        int answ[] = new int[2];
        boolean found = false;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == diff[j]) {
                    answ[0] = i;
                    answ[1] = j;
                    found = true;
                    break;
                }
                diff[i] = target - nums[i];
                if (found) {
                    break;
                }
            }
        }
        return(answ);
    }
}