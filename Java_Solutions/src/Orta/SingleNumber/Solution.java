package Orta.SingleNumber;
// Soru Linki : https://leetcode.com/problems/single-number/
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i <nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }
}