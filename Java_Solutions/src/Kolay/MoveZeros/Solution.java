package Kolay.MoveZeros;

import java.util.Stack;
// Soru linki : https://leetcode.com/problems/move-zeroes/description/
class Solution {
    public void moveZeroes(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        int counter = 0;
        for(int i = nums.length-1; i>=0;i--){
            if(nums[i]!=0){
                stack.push(nums[i]);
                counter++;
            }
        }
        int sizeForZero = nums.length - counter;
        int j = 0;
        while(counter>0){
            nums[j++] = stack.pop();
            counter--;
        }
        while(sizeForZero>0){
            nums[j++] = 0;
            sizeForZero--;
        }
    }
}
