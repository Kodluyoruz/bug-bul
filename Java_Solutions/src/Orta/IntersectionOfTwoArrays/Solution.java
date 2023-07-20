package Orta.IntersectionOfTwoArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Soru Linki : https://leetcode.com/problems/intersection-of-two-arrays/
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Set<Integer> answer = new HashSet<>();
        for(int num : nums2){
            if(binarySearch(nums1,num)){
                answer.add(num);// 2
            }
        }
        // answer = 2
        int[] ans = new int[answer.size()];
        int i = 0;
        for(int num : answer){
            ans[i++] = num;
        }
        return ans;
    }

    private boolean binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] < target){
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                return true;
            }
        }
        return false;
    }
}

