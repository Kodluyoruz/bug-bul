package Orta.HouseRobber;
// Soru Linki : https://leetcode.com/problems/house-robber/
class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;
        int temp;
        for(int num:nums){
            temp = prev1;
            prev1 = Math.max(prev2+num,prev1);
            prev2 = temp;
        }
        return prev1;
    }
}