package Kolay.SearchInsertPosition;
// Soru linki : https://leetcode.com/problems/search-insert-position/description/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int lowest = 0;
        int highest = nums.length-1;
        while(lowest<=highest){
            int mid = lowest+(highest-lowest)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target<nums[mid]){
                highest=mid-1;
            }else{
                lowest = mid+1;
            }
        }
        return lowest;
    }
}
