package Kolay.ArrangingCoins;
// Soru linki : https://leetcode.com/problems/arranging-coins/description/
class Solution {
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        while(start <= end){
            long mid = start + (end - start) / 2;
            long coins = mid*(mid+1)/2;
            if(coins == n){
                return (int)mid;
            }
            if(coins > n) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return (int)end;
    }
}